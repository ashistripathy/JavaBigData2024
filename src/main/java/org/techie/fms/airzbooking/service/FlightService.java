package org.techie.fms.airzbooking.service;

import org.techie.fms.airzbooking.dto.FlightSearchRequest;
import org.techie.fms.airzbooking.model.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightService {
    List<Flight> searchFlights(FlightSearchRequest searchRequest);
    Flight getFlightById(Long id);
    void updateFlightDetails(Long id,Flight flight);
}
