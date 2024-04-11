package org.techie.fms.airzbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.techie.fms.airzbooking.dto.BookingRequest;
import org.techie.fms.airzbooking.model.Booking;
import org.techie.fms.airzbooking.service.BookingService;

@RestController
@RequestMapping("/flights")
public class BookingController {
    private final BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping("/bookings")
    public ResponseEntity<Booking> bookFlight(@RequestBody BookingRequest bookingRequest) {
        Booking booking = bookingService.bookFlight(bookingRequest);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }
}
