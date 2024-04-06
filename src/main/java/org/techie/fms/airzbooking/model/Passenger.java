package org.techie.fms.airzbooking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Passenger {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private String seatNumber;

    @ManyToOne
    private Booking booking;
}
