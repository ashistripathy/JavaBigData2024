package org.techie.fms.airzbooking.service;

import org.techie.fms.airzbooking.model.SeatAllocation;

import java.util.List;

public interface SeatAllocationService {
    List<SeatAllocation> getAllSeatAllocations();
    SeatAllocation getSeatAllocationById(Long id);
    SeatAllocation createSeatAllocation(SeatAllocation seatAllocation);
    void deleteSeatAllocation(Long id);
}
