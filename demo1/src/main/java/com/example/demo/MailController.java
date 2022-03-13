package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MailController{
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @PostMapping("/sendMail")
    public String getUserMail(@RequestBody CreatePayment){

    }

    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);

        message.setSubject("Votre code d'activation");

        String code = Code.generateCode();
        message.setText("Bonjour cher client:\n"
                + "\n Votre code d'activation est " + code + ". Ce mail est envoyé automatiquement. Ne pas divulguer ce code.");

        try {
            mailSender.send(message);
            System.out.println("Envoyer réussir!");
        } catch (Exception e) {
            System.out.println("Il y a un problème quand envoyer.");
        }
    }
}
