package org.techie.fms.airzbooking.dto;

public class CouponApplyRequest {
    private Long couponId;
    private Long bookingId;

    public CouponApplyRequest() {
    }

    public CouponApplyRequest(Long couponId, Long bookingId) {
        this.couponId = couponId;
        this.bookingId = bookingId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
}
