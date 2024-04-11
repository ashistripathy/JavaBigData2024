package org.techie.fms.airzbooking.service;

import org.techie.fms.airzbooking.dto.BookingRequest;
import org.techie.fms.airzbooking.model.Booking;

public interface BookingService {
    Booking bookFlight(BookingRequest request);
}
