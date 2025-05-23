package com.solo.scentory.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.solo.scentory")
@MapperScan(basePackages ="com.solo.scentory" , annotationClass = Mapper.class)
public class ContextConfig {
}
