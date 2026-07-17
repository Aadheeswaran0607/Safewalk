package com.example.safewalk.repository;

import com.example.safewalk.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; // 👈 IMPORTANT import

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    List<Contact> findByUserId(int userId); // 🔥 ADD THIS

}