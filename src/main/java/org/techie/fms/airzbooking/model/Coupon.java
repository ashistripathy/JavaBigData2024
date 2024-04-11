package org.techie.fms.airzbooking.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.techie.fms.airzbooking.types.UserType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String couponCode;
    private int discountPercentage;
    private UserType userTypeRestriction;
    private String validityPeriod;

    public Coupon(String couponCode, int discountPercentage, UserType userTypeRestriction, String validityPeriod) {
        this.couponCode = couponCode;
        this.discountPercentage = discountPercentage;
        this.userTypeRestriction = userTypeRestriction;
        this.validityPeriod = validityPeriod;
    }
}
