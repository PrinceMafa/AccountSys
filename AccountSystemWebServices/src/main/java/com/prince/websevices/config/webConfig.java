package com.prince.websevices.config;

import com.prince.logic.config.LogicConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({LogicConfig.class})
@ComponentScan(basePackages = {
        "com.prince.webservices.controller",
})
public class webConfig {
}
