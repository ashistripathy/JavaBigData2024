package org.techie.fms.airzbooking.service;

import org.techie.fms.airzbooking.model.Coupon;

import java.util.List;

public interface CouponService {
    List<Coupon> getAllCoupons();
    Coupon getCouponById(Long id);
    Coupon createCoupon(Coupon coupon);
    void deleteCoupon(Long id);
}
