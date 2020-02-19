package com.demo.propertyscan.application;

import com.demo.propertyscan.repository.RepositoryModuleConfiguration;
import com.demo.propertyscan.service.ServiceModuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({RepositoryModuleConfiguration.class, ServiceModuleConfiguration.class})
public class ProperyScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProperyScanApplication.class, args);
    }
}
