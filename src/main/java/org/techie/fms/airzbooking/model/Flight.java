package org.techie.fms.airzbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String source;
    private String destination;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private double fare;
    private int duration;
    private int availableSeats;
    private boolean isOneWay;

    public Flight(String source, String destination, LocalDateTime departureDateTime, boolean isOneWay) {
        this.source = source;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.isOneWay = isOneWay;
    }
}
