package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    MailController mailController;

    @Test
    void contextLoads() throws Exception{
        /*String to =mailController.getUserMail();
        mailController.sendMail(to);*/
    }
}
