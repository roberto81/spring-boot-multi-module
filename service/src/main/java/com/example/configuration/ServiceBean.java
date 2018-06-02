package com.example.configuration;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBean {

    @Bean
    public DozerBeanMapper dozerMapper(){

        return new DozerBeanMapper();
    }
}
