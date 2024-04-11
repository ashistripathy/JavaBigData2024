package org.techie.fms.airzbooking.dto;

public class PassengerRequest {
    private String passengerName;
    private String email;

    public PassengerRequest() {
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
