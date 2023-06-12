package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean //la anotación es similar al bean del archivo beans.xml
    public Mundo mundo(){
        return new Mundo();
    }
}
