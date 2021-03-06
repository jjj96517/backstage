package com.piaoniu.backstage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 异常处理
 */
@Configuration
public class ExceptionConfig {

    @Bean
    public SimpleMappingExceptionResolver resolver(){
        SimpleMappingExceptionResolver resolver=new SimpleMappingExceptionResolver();
        Properties properties=new Properties();
        properties.setProperty("org.apache.shiro.authz.UnauthorizedException","/403");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}
