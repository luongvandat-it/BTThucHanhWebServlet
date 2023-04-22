package com.luongvandat.configs;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.luongvandat.repositories")
@EntityScan(basePackages = "com.luongvandat.models")
public class AppConfig {
}