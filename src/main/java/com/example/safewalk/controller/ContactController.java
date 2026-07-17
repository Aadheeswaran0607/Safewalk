package com.example.safewalk.controller;

import com.example.safewalk.model.Contact;
import com.example.safewalk.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping("/all")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<Contact> getContactsByUser(@PathVariable int userId) {
        return contactRepository.findByUserId(userId);
    }
}
