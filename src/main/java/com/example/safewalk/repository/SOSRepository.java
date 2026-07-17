package com.example.safewalk.repository;

import com.example.safewalk.model.SOSAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SOSRepository extends JpaRepository<SOSAlert, Long> {
}