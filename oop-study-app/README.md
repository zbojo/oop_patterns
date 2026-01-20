# OOP Study App

Aplikácia na štúdium OOP (Object-Oriented Programming) a návrhových vzorov.

## Požiadavky

- Node.js (v18+)
- npm

## Inštalácia

```bash
cd oop-study-app
npm install
```

## Spustenie

```bash
npm run dev
```

Aplikácia bude dostupná na `http://localhost:5173/` (alebo inom porte ak je 5173 obsadený).

## Dátové súbory

**DÔLEŽITÉ:** Aplikácia vyžaduje dátové súbory, ktoré nie sú súčasťou repozitára.

### Potrebné súbory:

1. **`app_data.json`** - hlavný dátový súbor (v `public/` priečinku)
2. **`oop-data/`** - priečinok s OOP materiálmi (v `public/` priečinku)

### Ako získať dátové súbory:

Kontaktujte autora projektu pre získanie súborov `app_data.json` a priečinka `oop-data`.

## Štruktúra projektu

```
oop-study-app/
├── public/
│   ├── app_data.json          # Vyžiadať od autora
│   └── oop-data/              # Vyžiadať od autora
│       ├── Behavioral Patterns/
│       ├── Creational Patterns/
│       ├── Structural Patterns/
│       ├── abstractfactory/
│       ├── adapter/
│       ├── builder/
│       ├── chain/
│       ├── composite/
│       ├── decorator/
│       ├── facade/
│       ├── factorymethod/
│       ├── iterator/
│       ├── observer/
│       ├── prototype/
│       ├── proxy/
│       ├── singleton/
│       ├── strategy/
│       ├── visitor/
│       └── ... (PDF a DOCX súbory s teóriou)
├── src/
├── package.json
└── vite.config.js
```

## Príkazy

| Príkaz | Popis |
|--------|-------|
| `npm install` | Inštalácia závislostí |
| `npm run dev` | Spustenie vývojového servera |
| `npm run build` | Build pre produkciu |
| `npm run preview` | Náhľad produkčného buildu |
