package com.demo.propertyscan.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "com.richard.propertyscan.repository.enabled",
        havingValue = "true")
@ComponentScan(basePackages = "com.richard.propertyscan.repository")
public class RepositoryModuleConfiguration {
}
