package com.prince.logic.config;


import com.prince.translator.config.translatorConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({translatorConfig.class})
@ComponentScan(basePackages = "com.prince.logic")
public class LogicConfig {
}
