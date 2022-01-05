package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.service.CustomerService;
import com.primebanc.primespringbootjavams.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/sh/")
public class MailCotroller {

    @Autowired
    private CustomerService cs;

    @Autowired
    private MailService ms;

    public static class MailId{
        public String mail;
    }

    public static class  MailDetails{
        public String mail;
        public String code;
        public String newpassword;
    }

    @PostMapping("mail")
    public ResponseEntity<String> sendMail(@RequestBody() MailId mailid){
        if(cs.checkMail(mailid.mail)) {
            ms.sendEmail(mailid.mail);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("checkmail")
    public ResponseEntity<String> changePassword(@RequestBody() MailDetails md){
        if(ms.checkCode(md.code)){
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
