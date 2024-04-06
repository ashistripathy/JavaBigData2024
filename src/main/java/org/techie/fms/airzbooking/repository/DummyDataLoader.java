package org.techie.fms.airzbooking.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.techie.fms.airzbooking.model.Flight;

import java.time.LocalDateTime;

@Component
public class DummyDataLoader implements CommandLineRunner {
    @Autowired
    FlightRepository flightRepository;
    @Override
    public void run(String... args) throws Exception {
        LocalDateTime now = LocalDateTime.now();

        Flight flight1 = new Flight("DeltaAir123", "New York", "Los Angeles", now, now.plusHours(4), 200.0, 240, 10,true);
        Flight flight2 = new Flight("DeltaAir321", "Los Angeles", "Chicago", now, now.plusHours(3), 150.0, 180, 5,false);
        Flight flight3 = new Flight("DeltaAir456", "Chicago", "Boston", now, now.plusHours(2), 100.0, 120, 2,false);

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
    }
}
