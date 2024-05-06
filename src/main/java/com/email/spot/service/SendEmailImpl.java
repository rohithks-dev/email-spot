package com.email.spot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailImpl implements SendEmailService{

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sendEmail;

    @Override
    public String sendEmail() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(sendEmail);
        mailMessage.setTo("gajjelsa@protonmail.com");
        mailMessage.setSubject("Pani Chusukora");
        mailMessage.setText("This is a test email. Pani chusukora PUKA");

        mailSender.send(mailMessage);
        return "Email Sent";
    }
}
