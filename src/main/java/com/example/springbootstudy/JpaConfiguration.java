package com.example.springbootstudy;

import com.example.springbootstudy.config.DatabaseProperties;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@Conditional(JpaCondition.class)
public class JpaConfiguration {

    @PostConstruct
    void init(){
        log.info("Jpa configuration is enabled");
    }

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DatabaseProperties databaseProperties(){
//        return new DatabaseProperties();
//    }
}
