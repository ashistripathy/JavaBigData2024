package org.techie.fms.airzbooking.dto;

import java.util.List;

public class BookingRequest {
    private Long flightId;
    private List<PassengerRequest> passengers;

    public BookingRequest() {
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public List<PassengerRequest> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerRequest> passengers) {
        this.passengers = passengers;
    }
}
