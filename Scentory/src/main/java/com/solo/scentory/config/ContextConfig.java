package com.solo.scentory.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackageClasses =  ScentoryApplication.class)

@MapperScan(basePackageClasses =  ScentoryApplication.class)
public class ContextConfig {
}
