package org.techie.fms.airzbooking.dto;

public class PassengerDetails {
    private String name;
    private int age;
    private String seatPreference;
    private String specialRequest;
    private String email;

    public PassengerDetails() {
    }

    public PassengerDetails(String name, int age, String seatPreference, String specialRequest,String email) {
        this.name = name;
        this.age = age;
        this.seatPreference = seatPreference;
        this.specialRequest = specialRequest;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
}
