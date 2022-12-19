package com.example.demo.Entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long station_id;
    private String name;

    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin;

    public void setUser(Admin admin) {
        this.admin = admin;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.station_id = id;
    }

    public Long getId() {
        return station_id;
    }


}