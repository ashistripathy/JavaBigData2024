package org.techie.fms.airzbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.techie.fms.airzbooking.model.Flight;
import org.techie.fms.airzbooking.service.FlightService;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable String id) {
        Flight flight = flightService.getFlightById(id);
        if (flight != null) {
            return ResponseEntity.ok(flight);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFlightDetails(@PathVariable String id, @RequestBody Flight updatedFlight) {
        Flight existingFlight = flightService.getFlightById(id);
        if (existingFlight != null) {
            flightService.updateFlightDetails(id, updatedFlight);
            return ResponseEntity.noContent().build(); // Update successful
        } else {
            return ResponseEntity.notFound().build(); // Flight not found
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Flight>> searchFlights(@RequestParam String source,
                                                      @RequestParam String destination,
                                                      @RequestParam LocalDateTime departureDate,
                                                      @RequestParam boolean isOneWay) {
        List<Flight> flights = flightService.searchFlights(source, destination, departureDate, isOneWay);
        return ResponseEntity.ok(flights);
    }
}
