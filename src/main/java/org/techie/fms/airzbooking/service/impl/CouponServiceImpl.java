package org.techie.fms.airzbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techie.fms.airzbooking.model.Coupon;
import org.techie.fms.airzbooking.repository.CouponRepositroy;
import org.techie.fms.airzbooking.service.CouponService;

import java.util.List;
@Service
public class CouponServiceImpl implements CouponService {
    private final CouponRepositroy couponRepositroy;
    @Autowired
    public CouponServiceImpl(CouponRepositroy couponRepositroy) {
        this.couponRepositroy = couponRepositroy;
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return couponRepositroy.findAll();
    }

    @Override
    public Coupon getCouponById(Long id) {
        return couponRepositroy.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Coupon not found"));
    }

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return couponRepositroy.save(coupon);
    }

    @Override
    public void deleteCoupon(Long id) {
        couponRepositroy.deleteById(id);
    }
}
