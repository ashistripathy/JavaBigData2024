package org.techie.fms.airzbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techie.fms.airzbooking.dto.BookingRequest;
import org.techie.fms.airzbooking.dto.PassengerRequest;
import org.techie.fms.airzbooking.model.Booking;
import org.techie.fms.airzbooking.model.Passenger;
import org.techie.fms.airzbooking.repository.BookingRepository;
import org.techie.fms.airzbooking.service.BookingService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking bookFlight(BookingRequest request) {
        Booking booking = convertToBooking(request);
        return bookingRepository.save(booking);
    }

    private Booking convertToBooking(BookingRequest request) {
        Booking booking = new Booking();
        List<Passenger> passengers = request.getPassengers().stream()
                .map(this::converToPassenger)
                .collect(Collectors.toList());
        booking.setPassengers(passengers);
        return booking;
    }

    private Passenger converToPassenger(PassengerRequest passengerRequest) {
        Passenger passenger = new Passenger();
        passenger.setPassengerName(passengerRequest.getPassengerName());
        passenger.setEmail(passengerRequest.getEmail());
        return  passenger;
    }
}
