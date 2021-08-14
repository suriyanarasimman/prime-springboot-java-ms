package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.ContactUs;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.service.ContactUsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/messages")
public class ContactUsController {
    private ContactUsService contactUsService;

    public ContactUsController(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResponse addMessage(@RequestBody ContactUs userMessage){
        return contactUsService.addUserMessage(userMessage);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ContactUs> fetchAllUserMessages(){
        return contactUsService.fetchAllMessages();
    }
}
