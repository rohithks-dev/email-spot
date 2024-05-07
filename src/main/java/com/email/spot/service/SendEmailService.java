package com.email.spot.service;

import org.springframework.stereotype.Service;

@Service
public interface SendEmailService {
    String sendEmail(String to, String subject, String message);

}
