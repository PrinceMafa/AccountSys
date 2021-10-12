package com.prince.translator.config;

import com.prince.repository.config.RepoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RepoConfig.class})
@ComponentScan(basePackages = "com.prince.translator")
public class translatorConfig {
}
