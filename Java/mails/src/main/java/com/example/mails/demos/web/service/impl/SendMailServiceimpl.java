package com.example.mails.demos.web.service.impl;

import com.example.mails.demos.web.service.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service
public class SendMailServiceimpl implements SendMail {
    @Resource
    private JavaMailSender javaMailSender;
//    发送人，接收人，标题，正文
    private String from="1457668696@qq.com";
    private String to="13885923816@163.com";
    private String subject="测试邮件";
    private String context="你好啊";




    @Override
    public void sendMail() {
        SimpleMailMessage message=new SimpleMailMessage();
//        可以替代发件人
        message.setFrom(from+"(小甜甜)");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }
}
