package com.primebanc.primespringbootjavams.service;

import com.primebanc.primespringbootjavams.entities.ContactUs;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.repository.ContactUsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ContactUsService {
    private ContactUsRepository contactUsRepository;

    public ContactUsService(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    public CommonResponse addUserMessage(ContactUs userMessageInfo){
        userMessageInfo.setMessageDate(LocalDate.now());
        contactUsRepository.save(userMessageInfo);
        return new CommonResponse("ADDED","Message updated successfully.");
    }

    public List<ContactUs> fetchAllMessages(){
        return contactUsRepository.findAll();
    }
}
