package com.example.designpattern.singleton;

public class Singleton {
    private Singleton() {
    }

    private static class Holder {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }
}
