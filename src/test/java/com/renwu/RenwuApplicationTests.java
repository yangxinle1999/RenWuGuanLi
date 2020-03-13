package com.renwu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
class RenwuApplicationTests {

    @Autowired
    JavaMailSenderImpl
            javaMailSender; //自动注入邮件发送器

    @Test
    public void sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();  //用于发送简单的邮件（不包括附件等）
        //邮件设置
        message.setSubject( "通知-今晚开会"); //邮件主题
        message.setText("今晚7:30开会"); //邮件内容
        message.setTo( "2842611637@qq.com") ;  //邮件发送给谁
        message.setFrom( "2842611637@qq.com");   //邮件是由谁发的
        javaMailSender.send(message);  //发送邮件

    }

    @Test
    public void test02( ) throws Exception {
        //1.创建一个复杂的消息邮件,用于发送复杂邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);//true表示支持文件上传
       //2.邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天7:30 开会</b>",true);//true表示开启html解析
        helper.setTo("2842611637@qq.com");
        helper.setFrom("2842611637@qq.com");
        helper.addAttachment("timg.jpg",new File("C:\\Users\\Mypc\\Pictures\\timg.jpg"));//上传文件
        javaMailSender.send(mimeMessage);
    }
        @Test
    void contextLoads() {
    }

}
