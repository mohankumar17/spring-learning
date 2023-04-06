package com.di.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.di.demo")
@PropertySource("config.properties") //classpath:config.properties
public class BeansConfig {

}
