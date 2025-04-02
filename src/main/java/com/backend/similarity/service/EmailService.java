package com.backend.similarity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendContactEmail(String name, String fromEmail, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("similarity.help@gmail.com");
        mailMessage.setSubject("Contact Form Submission from " + name);
        mailMessage.setText("Sender Email: " + fromEmail + "\n\nMessage: " + message);

        emailSender.send(mailMessage);
    }
}
