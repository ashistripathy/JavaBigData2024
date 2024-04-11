package org.techie.fms.airzbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.techie.fms.airzbooking.dto.FlightSearchRequest;
import org.techie.fms.airzbooking.model.Flight;
import org.techie.fms.airzbooking.service.FlightService;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id) {
        Flight flight = flightService.getFlightById(id);
        if (flight != null) {
            return ResponseEntity.ok(flight);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFlightDetails(@PathVariable Long id, @RequestBody Flight updatedFlight) {
        Flight existingFlight = flightService.getFlightById(id);
        if (existingFlight != null) {
            flightService.updateFlightDetails(id, updatedFlight);
            return ResponseEntity.noContent().build(); // Update successful
        } else {
            return ResponseEntity.notFound().build(); // Flight not found
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Flight>> searchFlights(@RequestBody FlightSearchRequest searchRequest) {

        List<Flight> flights = flightService.searchFlights(searchRequest);
        return ResponseEntity.ok(flights);
    }
}
