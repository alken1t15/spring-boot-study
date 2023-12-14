package com.example.springbootstudy.database;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component("pool1")
@RequiredArgsConstructor
public class ConnectionPool {
    @Value("${db.username}")
    private final String username;
    @Value("${db.pool.size}")
    private final Integer poolSize;

//    private  List<Object> args;
//    private  Map<String,Object> properties;
//    private  Map<String,Object> lucky;


//    public void setLucky(Map<String, Object> lucky) {
//        this.lucky = lucky;
//    }

    @PostConstruct
    private void init() {
        log.info("Init method");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Properties set");
//    }

    @PreDestroy
    private void destroy() {
        log.info("Clean connection pool");
    }
}
