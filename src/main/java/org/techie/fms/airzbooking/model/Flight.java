package org.techie.fms.airzbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;

    private String source;
    private String destination;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private double fare;
    private int duration;
    private int availableSeats;
    private boolean isOneWay;
}
