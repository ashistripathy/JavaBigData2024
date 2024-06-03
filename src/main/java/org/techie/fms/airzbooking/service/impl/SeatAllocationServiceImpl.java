package org.techie.fms.airzbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techie.fms.airzbooking.model.SeatAllocation;
import org.techie.fms.airzbooking.repository.SeatAllocationRepository;
import org.techie.fms.airzbooking.service.SeatAllocationService;

import java.util.List;
@Service
public class SeatAllocationServiceImpl implements SeatAllocationService {
    SeatAllocationRepository seatAllocationRepository;
    @Autowired
    public SeatAllocationServiceImpl(SeatAllocationRepository seatAllocationRepository) {
        this.seatAllocationRepository = seatAllocationRepository;
    }

    @Override
    public List<SeatAllocation> getAllSeatAllocations() {
        return seatAllocationRepository.findAll();
    }

    @Override
    public SeatAllocation getSeatAllocationById(Long id) {
        return seatAllocationRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Seat Allocation not found"));
    }

    @Override
    public SeatAllocation createSeatAllocation(SeatAllocation seatAllocation) {
        return seatAllocationRepository.save(seatAllocation);
    }

    @Override
    public void deleteSeatAllocation(Long id) {
        seatAllocationRepository.deleteById(id);
    }
}
