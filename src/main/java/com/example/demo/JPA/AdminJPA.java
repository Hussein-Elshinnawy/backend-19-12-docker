package com.example.demo.JPA;

import com.example.demo.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJPA extends JpaRepository <Admin , Long> {
}
