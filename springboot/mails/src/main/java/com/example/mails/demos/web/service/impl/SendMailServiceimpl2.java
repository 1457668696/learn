package com.example.mails.demos.web.service.impl;

import com.example.mails.demos.web.service.SendMail;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class SendMailServiceimpl2 implements SendMail {
    @Resource
    private JavaMailSender javaMailSender;
    //    发送人，接收人，标题，正文
    private String from = "1457668696@qq.com";
    private String to = "13885923816@163.com";
    private String subject = "测试邮件";
    private String context = "<h1>你好啊</h1>";


    @Override
    public void sendMail() {

        try {

            //        多内容邮件对象
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            //        true允许附件
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from + "(小甜甜)");
            helper.setTo(to);
            helper.setSubject(subject);
            // 开启html
            helper.setText(context, true);


            //  添加附件
            File f1 = new File("D:\\text.txt");
            helper.addAttachment(f1.getName(), f1);


            javaMailSender.send(mimeMessage);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
