package com.example.demo.Services;

import com.example.demo.Entities.Station;
import com.example.demo.JPA.StationJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    @Autowired
    StationJPA StationJPA;

    public void createStation(Station s){
        StationJPA.save(s);
    }

    public Station getStation(Long id){
        return StationJPA.findById(id).get();
    }

    public List<Station> getAllStations(){
        return StationJPA.findAll();
    }

    public void deleteStation(Long id){
        StationJPA.deleteById(id);
    }
}
