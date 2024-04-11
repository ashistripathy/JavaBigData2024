package org.techie.fms.airzbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techie.fms.airzbooking.dto.FlightSearchRequest;
import org.techie.fms.airzbooking.model.Flight;
import org.techie.fms.airzbooking.repository.FlightRepository;
import org.techie.fms.airzbooking.service.FlightService;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;
    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> searchFlights(FlightSearchRequest searchRequest) {
        String source = searchRequest.get_source();
        String destination = searchRequest.get_destination();
        LocalDateTime departureDateTime = searchRequest.get_departureDate();
        boolean isOneWay = searchRequest.is_isOneWay();
        return flightRepository.findBySourceAndDestinationAndDepartureDateTimeAndIsOneWayOrderByFareAscDurationAsc(source, destination, departureDateTime, isOneWay);
    }

    @Override
    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public void updateFlightDetails(Long id,Flight flight) {
        flightRepository.save(flight);
    }
}
