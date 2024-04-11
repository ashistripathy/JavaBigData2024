package org.techie.fms.airzbooking.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.techie.fms.airzbooking.model.Flight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DummyDataLoader implements CommandLineRunner {
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

        Flight flight1 = new Flight("New York", "Los Angeles", LocalDateTime.of(2024,4,15,12,0),true);
        Flight flight2 = new Flight("Los Angeles", "Chicago", LocalDateTime.of(2024,5,15,12,0),  false);
        Flight flight3 = new Flight("Chicago", "Boston",LocalDateTime.of(2024,6,15,12,0),false);
        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
    }
}
