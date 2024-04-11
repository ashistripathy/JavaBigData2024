package org.techie.fms.airzbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.techie.fms.airzbooking.model.SeatAllocation;
import org.techie.fms.airzbooking.service.SeatAllocationService;

import java.util.List;

@RestController
@RequestMapping("/seatAllocations")
public class SeatAllocationController {
    private final SeatAllocationService seatAllocationService;
    @Autowired
    public SeatAllocationController(SeatAllocationService seatAllocationService) {
        this.seatAllocationService = seatAllocationService;
    }
    @GetMapping
    public ResponseEntity<List<SeatAllocation>> getAllSeatAllocations(){
        List<SeatAllocation> seatAllocation = seatAllocationService.getAllSeatAllocations();
        return new ResponseEntity<>(seatAllocation, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SeatAllocation> getSeatAllocationsById(@PathVariable Long id){
        SeatAllocation seatAllocation = seatAllocationService.getSeatAllocationById(id);
        return new ResponseEntity<>(seatAllocation,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<SeatAllocation> createSeatAllocations(@RequestBody SeatAllocation seatAllocation){
        SeatAllocation createSeatAllocation = seatAllocationService.createSeatAllocation(seatAllocation);
        return new ResponseEntity<>(createSeatAllocation,HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeatAllocation(@PathVariable Long id){
        seatAllocationService.deleteSeatAllocation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
