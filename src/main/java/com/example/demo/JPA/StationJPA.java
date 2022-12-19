package com.example.demo.JPA;

import com.example.demo.Entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationJPA extends JpaRepository <Station , Long> {
}
