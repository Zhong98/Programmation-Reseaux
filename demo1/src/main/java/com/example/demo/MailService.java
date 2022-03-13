package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MailService extends JpaRepository<String,Integer> {
}
