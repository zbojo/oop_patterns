package com.company.singleton;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Storage instance = null;

    private Map<String, String> files;

    private Storage() {
        this.files = new HashMap<>();
    }

    public static Storage getInstance() {
        if (instance == null)
            instance = new Storage();
        return instance;
    }

    public void saveFile(String name, String content) {
        this.files.put(name, content);
    }

    public String loadFile(String name) {
        return this.files.get(name);
    }
}
