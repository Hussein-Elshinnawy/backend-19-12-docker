package com.example.demo.JPA;

import com.example.demo.Entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripJPA extends JpaRepository <Trip , Long> {
}
