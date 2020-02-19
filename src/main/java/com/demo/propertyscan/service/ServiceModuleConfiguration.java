package com.demo.propertyscan.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "com.richard.propertyscan.service.enabled",
        havingValue = "true")
@ComponentScan(basePackages = "com.richard.propertyscan.service")
public class ServiceModuleConfiguration {
}
