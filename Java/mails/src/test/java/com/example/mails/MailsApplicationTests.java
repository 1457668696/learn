package com.example.mails;

import com.example.mails.demos.web.service.SendMail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MailsApplicationTests {

    @Resource
    private SendMail sendMail;

    @Test
    void contextLoads() {

        sendMail.sendMail();


    }

}
