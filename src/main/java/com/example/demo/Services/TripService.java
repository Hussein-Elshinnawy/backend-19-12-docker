package com.example.demo.Services;
import com.example.demo.Entities.Trip;
import com.example.demo.JPA.TripJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    TripJPA tripJPA;
    Trip tr;
    public void createTrip(Trip t){
        tripJPA.save(t);
    }

    public Trip getTrip(long id){return tripJPA.findById(id).get();}

    public List<Trip> getAllTrips(){
        return tripJPA.findAll();
    }

    public void deleteTrip(Long id){
        tripJPA.deleteById(id);
    }

    public Trip updateTrip(Trip body, Long id){

        Trip trip= tripJPA.findById(id).get();
        trip.setFromStation(body.getFromStation());
        trip.setToStation(body.getToStation());
        trip.setStartTime(body.getStartTime());
        trip.setEndTime(body.getEndTime());
        return tripJPA.save(trip);
   /*    tr = tripJPA.findById(id).get();
        tr.setFromStation(t.getFromStation());
        tr.setToStation(t.getToStation());
        tr.setStartTime(t.getStartTime());
        tr.setEndTime(t.getEndTime());
        return tripJPA.save(tr);*/


    }


}
