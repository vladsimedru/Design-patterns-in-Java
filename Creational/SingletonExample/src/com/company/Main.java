package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println(RepositorySingleton.getInstance()));
        Thread thread2 = new Thread(() -> System.out.println(RepositorySingleton.getInstance()));
        Thread thread3 = new Thread(() -> System.out.println(RepositorySingleton.getInstance()));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
