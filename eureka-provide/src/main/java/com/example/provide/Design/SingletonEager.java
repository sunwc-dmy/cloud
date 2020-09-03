package com.example.provide.Design;

import org.springframework.context.annotation.Configuration;

//@Configuration
public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
