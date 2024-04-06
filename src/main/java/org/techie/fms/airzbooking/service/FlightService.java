package org.techie.fms.airzbooking.service;

import org.techie.fms.airzbooking.model.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightService {
    List<Flight> searchFlights(String source, String destination, LocalDateTime departureDate, boolean isOneWay);
    Flight getFlightById(String id);
    void updateFlightDetails(String id,Flight flight);
}
