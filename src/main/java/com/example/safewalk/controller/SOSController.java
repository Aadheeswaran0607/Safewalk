package com.example.safewalk.controller;

import com.example.safewalk.model.SOSAlert;
import com.example.safewalk.repository.SOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sos")
public class SOSController {

    @Autowired
    private SOSRepository sosRepository;

    @PostMapping("/alert")
    public SOSAlert sendSOS(@RequestBody SOSAlert alert) {
        return sosRepository.save(alert);
    }

    @GetMapping("/all")
    public List<SOSAlert> getAllAlerts() {
        return sosRepository.findAll();
    }
}
