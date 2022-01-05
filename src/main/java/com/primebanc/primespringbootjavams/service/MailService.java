package com.primebanc.primespringbootjavams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender jms;

    public void sendEmail(String to) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);

        msg.setSubject("Reset Code");
        msg.setText("qwerty");

        jms.send(msg);
    }

    public boolean checkCode(String code){
        if(code == "qwerty"){
            return true;
        }
        else{
            return false;
        }
    }

}
