package org.test.fmtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;

/**
 * created by Irina
 */
@SpringBootApplication
public class FreemarkerTestApplication implements CommandLineRunner {


    @Autowired
    private WebApplicationContext webApplicationContext;

    //
    @Override
    public void run(String... strings) throws Exception {
        //
        //
    }

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerTestApplication.class, args);
    }
}
