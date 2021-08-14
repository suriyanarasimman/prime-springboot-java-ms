package com.primebanc.primespringbootjavams.repository;

import com.primebanc.primespringbootjavams.entities.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long> {
}
