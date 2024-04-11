package org.techie.fms.airzbooking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue
    private Long id;

    private String passengerName;
    private int age;
    private String seatNumber;
    private String email;

    @ManyToOne
    private Booking booking;
}
