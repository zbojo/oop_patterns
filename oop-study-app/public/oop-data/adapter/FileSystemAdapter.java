package com.company.adapter;

public class FileSystemAdapter implements DocumentAdapter {

    private FileSystem fileSystem;

    public FileSystemAdapter() {
        this.fileSystem = new FileSystem();
    }


    @Override
    public Document getDocument(String name) {
        String fileName = "file_name_of_document_" + name;
        String data = this.fileSystem.getFile(fileName);
        return new Document(name, data);
    }
}
