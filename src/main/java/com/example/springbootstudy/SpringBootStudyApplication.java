package com.example.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootStudyApplication {

    public static void main(String[] args) {
      var context =  SpringApplication.run(SpringBootStudyApplication.class, args);
        System.out.println(context.getBeanDefinitionCount());
        System.out.println(context.getBean("pool1"));
    }

}
