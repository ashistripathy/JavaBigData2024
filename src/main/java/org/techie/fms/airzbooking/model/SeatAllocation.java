package org.techie.fms.airzbooking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class SeatAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  Long flightId;
    private  String seatNumber;
    private boolean isOccupied;

    public SeatAllocation(Long flightId, String seatNumber, boolean isOccupied) {
        this.flightId = flightId;
        this.seatNumber = seatNumber;
        this.isOccupied = isOccupied;
    }
}
