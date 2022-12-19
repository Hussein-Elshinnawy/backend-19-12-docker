package com.example.demo.Controllers;
import com.example.demo.Entities.Trip;
import com.example.demo.Services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
@CrossOrigin(origins = "http://localhost:4200")
public class TripController {
    @Autowired
    TripService tripService;

    @PostMapping("/createTrip")
    @CrossOrigin(origins = "http://localhost:4200")
    public void createTrip(@RequestBody Trip t){
        tripService.createTrip(t);

    }

    @GetMapping("/getTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Trip getTripById(@PathVariable Long id)
    {
      return tripService.getTrip(id);
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Trip> getAllTrips(){
        return tripService.getAllTrips();
    }

    @DeleteMapping("/deleteTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
    }

    @PutMapping("/updateTrip/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Trip updateTrip(@RequestBody Trip body ,@PathVariable Long id){
        return tripService.updateTrip(body, id);
    }

}
