package com.example.demo.Entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Admin {


    @OneToMany(mappedBy = "admin",fetch=FetchType.EAGER)
    private Set <Trip> trips = new HashSet<Trip>();

    @OneToMany(mappedBy = "admin",fetch=FetchType.EAGER)
    private Set <Station> stations = new HashSet<Station>();
    public Set<Station> getStations() {
        return stations;
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }

    public void addStation(Station s)
    {
        this.stations.add(s);
    }
    public Set<Trip> getTrips() {
        return trips;
    }

    public void setTrips(Set<Trip> trips) {
        this.trips = trips;
    }
    public void addTrip(Trip t)
    {
        this.trips.add(t);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;
    private String username;
    private String password;
    public void setId(Long id) {
        this.admin_id = id;
    }

    public Long getId() {
        return admin_id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
