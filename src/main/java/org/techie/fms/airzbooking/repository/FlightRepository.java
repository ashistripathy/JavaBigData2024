package org.techie.fms.airzbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techie.fms.airzbooking.model.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Repository
public interface FlightRepository extends JpaRepository<Flight,String> {
    List<Flight> findBySourceAndDestinationAndDepartureDateTimeAndIsOneWayOrderByFareAscDurationAsc(String source, String destination, LocalDateTime departureDate, boolean isOneWay);

    default Flight getFlightById(String id) {
        Optional<Flight> optionalFlight = findById(id);
        return optionalFlight.orElse(null);
    }
    default void updateFlightDetails(String id, Flight updatedFlight) {
        Flight existingFlight = findById(id).orElse(null);
        if (existingFlight != null) {
            existingFlight.setSource(updatedFlight.getSource());
            existingFlight.setDestination(updatedFlight.getDestination());
            existingFlight.setDepartureDateTime(updatedFlight.getDepartureDateTime());
            existingFlight.setArrivalDateTime(updatedFlight.getArrivalDateTime());
            existingFlight.setFare(updatedFlight.getFare());
            existingFlight.setDuration(updatedFlight.getDuration());
            existingFlight.setAvailableSeats(updatedFlight.getAvailableSeats());
            existingFlight.setOneWay(updatedFlight.isOneWay());
            save(existingFlight);
        }
    }
}

