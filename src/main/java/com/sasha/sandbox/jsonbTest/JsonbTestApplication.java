package com.sasha.sandbox.jsonbTest;

import com.sasha.sandbox.jsonbTest.model.Role;
import com.sasha.sandbox.jsonbTest.model.User;
import com.sasha.sandbox.jsonbTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JsonbTestApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(JsonbTestApplication.class, args);
        Test test = appContext.getBean(Test.class);
        test.creatAndSaveUser();

    }


}
