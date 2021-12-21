package com.company;

public class RepositorySingleton {
    private static volatile RepositorySingleton instance = null;

    private RepositorySingleton() {
    }

    public static RepositorySingleton getInstance() {
        if (instance == null) {
            synchronized (RepositorySingleton.class) {
                if (instance == null) {
                    instance = new RepositorySingleton();
                }
            }
        }
        return instance;
    }
}
