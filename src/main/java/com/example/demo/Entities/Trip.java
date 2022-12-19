package com.example.demo.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Trip {

    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin;

    public void setUser(Admin admin) {
        this.admin = admin;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trip_id;
    private String startTime;
    private String endTime;
    private String fromStation;
    private String toStation;


    public void setId(Long id) {
        this.trip_id = id;
    }

    public Long getId() {
        return trip_id;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getFromStation() {
        return this.fromStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getToStation() {
        return this.toStation;
    }
}
