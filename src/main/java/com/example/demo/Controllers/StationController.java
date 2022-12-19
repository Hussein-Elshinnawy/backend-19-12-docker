package com.example.demo.Controllers;

import com.example.demo.Entities.Station;
import com.example.demo.Services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/station")
@CrossOrigin(origins = "http://localhost:4200")
public class StationController {
    @Autowired
    StationService stationservice;

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:4200")
    public void createStation(@RequestBody Station s){
        stationservice.createStation(s);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Station getStationById(@PathVariable Long id){
        return stationservice.getStation(id);

    }

    @GetMapping("/getall")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Station> getAllStations(){
        return stationservice.getAllStations();
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteStation(@PathVariable Long id){
        stationservice.deleteStation(id);
    }
}
