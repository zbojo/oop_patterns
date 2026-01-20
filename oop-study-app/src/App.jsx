import { useState, useEffect } from 'react'
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter'
import { atomDark } from 'react-syntax-highlighter/dist/esm/styles/prism'
import './App.css'

function App() {
  const [data, setData] = useState(null)
  const [loading, setLoading] = useState(true)
  const [activeTab, setActiveTab] = useState('patterns')
  const [selectedPattern, setSelectedPattern] = useState(null)
  const [selectedUml, setSelectedUml] = useState(null)
  const [selectedFile, setSelectedFile] = useState(null)
  const [searchQuery, setSearchQuery] = useState('')
  const [openCategories, setOpenCategories] = useState({})
  const [openGroups, setOpenGroups] = useState({})
  const [modalImage, setModalImage] = useState(null)
  const [copySuccess, setCopySuccess] = useState(false)

  useEffect(() => {
    fetch('/app_data.json')
      .then(res => res.json())
      .then(data => {
        setData(data)
        const cats = {}
        Object.keys(data.categories).forEach(cat => {
          cats[cat] = true
        })
        setOpenCategories(cats)
        setLoading(false)
      })
      .catch(err => {
        console.error('Error loading data:', err)
        setLoading(false)
      })
  }, [])

  const toggleCategory = (category) => {
    setOpenCategories(prev => ({
      ...prev,
      [category]: !prev[category]
    }))
  }

  const toggleGroup = (groupKey) => {
    setOpenGroups(prev => ({
      ...prev,
      [groupKey]: !prev[groupKey]
    }))
  }

  // Extrahuje základný názov patternu (napr. "Builder" z "BuilderChocolate" alebo "Builder (Prep)")
  const getBasePatternName = (name) => {
    // Mapovanie špeciálnych prípadov
    const specialMappings = {
      'Chain of Responsibility': 'Chain of Responsibility',
      'ChainOfResponsibility (Prep)': 'Chain of Responsibility',
      'Chain (Exam)': 'Chain of Responsibility',
      'Abstract Factory': 'Abstract Factory',
      'AbstractFactory (Prep)': 'Abstract Factory',
      'Factory Method': 'Factory Method',
      'Factory (Prep)': 'Factory Method',
      'VisitorCalculateBasket': 'Visitor',
      'BuilderChocolate': 'Builder',
      'BuilderStockMarket': 'Builder',
    }

    if (specialMappings[name]) {
      return specialMappings[name]
    }

    // Odstráň suffixes ako (Prep), (Exam), (Lecture)
    let base = name.replace(/\s*\(Prep\)|\s*\(Exam\)|\s*\(Lecture\)/gi, '').trim()

    return base
  }

  // Zoskupí patterny podľa základného názvu
  const groupPatterns = (patterns) => {
    const groups = {}

    patterns.forEach(pattern => {
      const baseName = getBasePatternName(pattern.name)
      if (!groups[baseName]) {
        groups[baseName] = []
      }
      groups[baseName].push(pattern)
    })

    // Zoraď skupiny podľa názvu
    const sortedGroups = Object.entries(groups).sort((a, b) => a[0].localeCompare(b[0]))

    return sortedGroups
  }

  const handleSelectPattern = (pattern, category) => {
    setSelectedPattern({ ...pattern, category })
    setSelectedUml(null)
    if (pattern.java_files && pattern.java_files.length > 0) {
      setSelectedFile(pattern.java_files[0])
    }
  }

  const handleSelectUml = (uml) => {
    setSelectedUml(uml)
    setSelectedPattern(null)
  }

  const copyCode = () => {
    if (selectedFile && data?.java_files[selectedFile]) {
      navigator.clipboard.writeText(data.java_files[selectedFile])
      setCopySuccess(true)
      setTimeout(() => setCopySuccess(false), 2000)
    }
  }

  const filteredCategories = () => {
    if (!data || !searchQuery) return data?.categories || {}

    const filtered = {}
    Object.entries(data.categories).forEach(([cat, patterns]) => {
      const filteredPatterns = patterns.filter(p =>
        p.name.toLowerCase().includes(searchQuery.toLowerCase())
      )
      if (filteredPatterns.length > 0) {
        filtered[cat] = filteredPatterns
      }
    })
    return filtered
  }

  // Zlúči všetky patterny zo všetkých kategórií a zoskupí ich podľa base name
  const getAllPatternsGrouped = () => {
    if (!data) return []

    const allPatterns = []
    Object.entries(data.categories).forEach(([category, patterns]) => {
      patterns.forEach(pattern => {
        allPatterns.push({ ...pattern, category })
      })
    })

    // Filtruj podľa search query
    const filtered = searchQuery
      ? allPatterns.filter(p => p.name.toLowerCase().includes(searchQuery.toLowerCase()))
      : allPatterns

    // Zoskup podľa base name
    const groups = {}
    filtered.forEach(pattern => {
      const baseName = getBasePatternName(pattern.name)
      if (!groups[baseName]) {
        groups[baseName] = []
      }
      groups[baseName].push(pattern)
    })

    // Zoraď skupiny podľa názvu
    return Object.entries(groups).sort((a, b) => a[0].localeCompare(b[0]))
  }

  const filteredUmlDiagrams = () => {
    if (!data || !searchQuery) return data?.uml_diagrams || []
    return data.uml_diagrams.filter(u =>
      u.name.toLowerCase().includes(searchQuery.toLowerCase())
    )
  }

  const getStats = () => {
    if (!data) return { patterns: 0, files: 0, umls: 0 }
    let patternCount = 0
    Object.values(data.categories).forEach(patterns => {
      patternCount += patterns.length
    })
    return {
      patterns: patternCount,
      files: Object.keys(data.java_files).length,
      umls: data.uml_diagrams.length
    }
  }

  if (loading) {
    return (
      <div className="loading">
        <div className="spinner"></div>
        <p>Loading OOP Patterns...</p>
      </div>
    )
  }

  if (!data) {
    return (
      <div className="error">
        <h2>Error Loading Data</h2>
        <p>Make sure app_data.json is available.</p>
      </div>
    )
  }

  const stats = getStats()

  return (
    <div className="app-container">
      <aside className="sidebar">
        <div className="sidebar-header">
          <h1>OOP Patterns</h1>
          <p>Study App for Exam</p>
        </div>

        <div className="search-box">
          <input
            type="text"
            placeholder="Search patterns..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
          />
        </div>

        <div className="nav-tabs">
          <button
            className={`nav-tab ${activeTab === 'patterns' ? 'active' : ''}`}
            onClick={() => setActiveTab('patterns')}
          >
            Patterns
          </button>
          <button
            className={`nav-tab ${activeTab === 'uml' ? 'active' : ''}`}
            onClick={() => setActiveTab('uml')}
          >
            UML Diagrams
          </button>
        </div>

        {activeTab === 'patterns' && (
          <div className="patterns-nav">
            {getAllPatternsGrouped().map(([groupName, groupPatterns]) => {
              const groupKey = groupName
              const isGroupOpen = openGroups[groupKey] !== false // default open
              const hasMultiple = groupPatterns.length > 1

              if (!hasMultiple) {
                // Ak je len jeden pattern, zobraz ho priamo
                const pattern = groupPatterns[0]
                return (
                  <div
                    key={pattern.id}
                    className={`pattern-item single ${selectedPattern?.id === pattern.id ? 'active' : ''}`}
                    onClick={() => handleSelectPattern(pattern, pattern.category)}
                  >
                    {pattern.name}
                  </div>
                )
              }

              // Ak je viac patternov, zobraz skupinu
              return (
                <div key={groupKey} className={`pattern-group ${isGroupOpen ? 'open' : ''}`}>
                  <div className="pattern-group-header" onClick={() => toggleGroup(groupKey)}>
                    <span className="group-arrow">&#9654;</span>
                    <span className="group-name">{groupName}</span>
                    <span className="group-count">{groupPatterns.length}</span>
                  </div>
                  <div className="pattern-group-items">
                    {groupPatterns.map(pattern => (
                      <div
                        key={pattern.id}
                        className={`pattern-item nested ${selectedPattern?.id === pattern.id ? 'active' : ''}`}
                        onClick={() => handleSelectPattern(pattern, pattern.category)}
                      >
                        {pattern.name}
                      </div>
                    ))}
                  </div>
                </div>
              )
            })}
          </div>
        )}

        {activeTab === 'uml' && (
          <div className="uml-nav">
            {filteredUmlDiagrams().map(uml => (
              <div
                key={uml.path}
                className={`uml-item ${selectedUml?.path === uml.path ? 'active' : ''}`}
                onClick={() => handleSelectUml(uml)}
              >
                {uml.name}
              </div>
            ))}
          </div>
        )}
      </aside>

      <main className="main-content">
        {!selectedPattern && !selectedUml && (
          <div className="welcome">
            <h2>Welcome to OOP Study App</h2>
            <p>Select a design pattern from the sidebar to view its implementation code and UML diagrams.</p>
            <div className="stats">
              <div className="stat">
                <div className="stat-value">{stats.patterns}</div>
                <div className="stat-label">Patterns</div>
              </div>
              <div className="stat">
                <div className="stat-value">{stats.files}</div>
                <div className="stat-label">Java Files</div>
              </div>
              <div className="stat">
                <div className="stat-value">{stats.umls}</div>
                <div className="stat-label">UML Diagrams</div>
              </div>
            </div>
          </div>
        )}

        {selectedPattern && (
          <div className="pattern-view">
            <div className="content-header">
              <h2>{selectedPattern.name}</h2>
              <span className="badge">{selectedPattern.category}</span>
            </div>

            {selectedPattern.description && (
              <div className="pattern-description">
                {selectedPattern.description.split('\n').map((line, i) => {
                  if (line.startsWith('**') && line.includes(':**')) {
                    const parts = line.split(':**')
                    const title = parts[0].replace(/\*\*/g, '')
                    const content = parts.slice(1).join(':**')
                    return (
                      <div key={i} className="desc-section">
                        <strong>{title}:</strong>{content}
                      </div>
                    )
                  }
                  if (line.startsWith('- ')) {
                    return <div key={i} className="desc-bullet">{line}</div>
                  }
                  if (line.trim() === '') {
                    return <div key={i} className="desc-spacer"></div>
                  }
                  return <div key={i}>{line}</div>
                })}
              </div>
            )}

            <div className="files-container">
              <div className="files-tabs">
                {selectedPattern.java_files.map(file => (
                  <button
                    key={file}
                    className={`file-tab ${selectedFile === file ? 'active' : ''}`}
                    onClick={() => setSelectedFile(file)}
                  >
                    {file.split('/').pop()}
                  </button>
                ))}
              </div>

              <div className="code-container">
                <div className="code-header">
                  <span className="filename">{selectedFile?.split('/').pop()}</span>
                  <button className="copy-btn" onClick={copyCode}>
                    {copySuccess ? 'Copied!' : 'Copy Code'}
                  </button>
                </div>
                <div className="code-content">
                  <SyntaxHighlighter
                    language="java"
                    style={atomDark}
                    showLineNumbers
                    customStyle={{
                      margin: 0,
                      borderRadius: 0,
                      fontSize: '0.9rem',
                      lineHeight: '1.6'
                    }}
                  >
                    {data.java_files[selectedFile] || '// File not found'}
                  </SyntaxHighlighter>
                </div>
              </div>
            </div>

            {selectedPattern.images && selectedPattern.images.length > 0 && (
              <div className="images-section">
                <h3>Related Diagrams</h3>
                <div className="images-grid">
                  {selectedPattern.images.map(img => (
                    <div
                      key={img}
                      className="image-card"
                      onClick={() => setModalImage(`/oop-data/${img}`)}
                    >
                      <img src={`/oop-data/${img}`} alt="Diagram" loading="lazy" />
                      <div className="caption">{img.split('/').pop()}</div>
                    </div>
                  ))}
                </div>
              </div>
            )}
          </div>
        )}

        {selectedUml && (
          <div className="uml-view">
            <div className="content-header">
              <h2>{selectedUml.name}</h2>
            </div>
            <img
              src={`/oop-data/${selectedUml.path}`}
              alt={selectedUml.name}
              className="uml-image"
              onClick={() => setModalImage(`/oop-data/${selectedUml.path}`)}
            />
          </div>
        )}
      </main>

      {modalImage && (
        <div className="modal" onClick={() => setModalImage(null)}>
          <span className="modal-close">&times;</span>
          <img src={modalImage} alt="Full size" onClick={(e) => e.stopPropagation()} />
        </div>
      )}
    </div>
  )
}

export default App
