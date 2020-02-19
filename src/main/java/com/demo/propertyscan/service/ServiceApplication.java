package com.demo.propertyscan.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServiceApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Service Application Class");
    }
}
