package com.jonjazzy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
    /*
        Work of @SpringBootApplication
        1 - Confirms It is a spring context
        2 - Enables auto config
        3 - enables auto scan of the package
    */
public class SpringBootIn10StepsBasicsApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringBootIn10StepsBasicsApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = SpringApplication.run(SpringBootIn10StepsBasicsApplication.class, args);
        /*
        * SpringApplication.run, used to run a Spring Context, it takes a context as input
        * (i.e. SpringBootIn10StepsBasicsApplication)
        *
        * SpringApplication.run returns an App Context also.
        * */

        LOGGER.info("------------------------------------------------------------");
        LOGGER.info("The Beans in my appContext are:-");
        LOGGER.info("------------------------------------------------------------");
        for(String name : applicationContext.getBeanDefinitionNames())
        {
            /*
            *   Springboot looks at
            *       a)   The frameworks available ont he classPath
            *       b)   Existing configuration for the application
            * Based on these, Spring Boot provides basic configuration needed to
            * configure the application with these frameworks...creating the
            * beans automatically.
            *
            * This is called AutoConfiguration
            * */
            LOGGER.info(name);
        }
        LOGGER.info("------------------------------------------------------------");

    }

}
