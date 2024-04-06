package org.techie.fms.airzbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techie.fms.airzbooking.model.Flight;
import org.techie.fms.airzbooking.repository.FlightRepository;
import org.techie.fms.airzbooking.service.FlightService;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightRepository flightRepository;
    @Override
    public List<Flight> searchFlights(String source, String destination, LocalDateTime departureDate, boolean isOneWay) {
        return flightRepository.findBySourceAndDestinationAndDepartureDateTimeAndIsOneWayOrderByFareAscDurationAsc(source, destination, departureDate, isOneWay);
    }

    @Override
    public Flight getFlightById(String id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public void updateFlightDetails(String id,Flight flight) {
        flightRepository.save(flight);
    }
}
