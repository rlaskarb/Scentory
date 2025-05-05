package com.solo.scentory.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses =  ScentoryApplication.class)
@MapperScan(basePackageClasses =  ScentoryApplication.class)
public class ContextConfig {
}
