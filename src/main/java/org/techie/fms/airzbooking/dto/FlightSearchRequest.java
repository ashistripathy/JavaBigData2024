package org.techie.fms.airzbooking.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class FlightSearchRequest {
    private String _source;
    private String _destination;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime _departureDate;
    private boolean _isOneWay;

    public FlightSearchRequest() {
    }

    public String get_source() {
        return _source;
    }

    public void set_source(String _source) {
        this._source = _source;
    }

    public String get_destination() {
        return _destination;
    }

    public void set_destination(String _destination) {
        this._destination = _destination;
    }

    public LocalDateTime get_departureDate() {
        return _departureDate;
    }

    public void set_departureDate(LocalDateTime _departureDate) {
        this._departureDate = _departureDate;
    }

    public boolean is_isOneWay() {
        return _isOneWay;
    }

    public void set_isOneWay(boolean _isOneWay) {
        this._isOneWay = _isOneWay;
    }
}
