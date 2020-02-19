package com.demo.propertyscan.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepositoryApplication implements CommandLineRunner {
    private final int seconds;

    public RepositoryApplication(@Value("${seconds}") int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Repository Application " + seconds);
    }
}
