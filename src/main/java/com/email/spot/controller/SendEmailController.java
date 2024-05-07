package com.email.spot.controller;

import com.email.spot.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("/sendemail")
    public String sendEmail(@RequestParam("to") String to,
                            @RequestParam("subject") String subject,
                            @RequestParam("message") String message) {
        return sendEmailService.sendEmail(to, subject, message);
    }

}
