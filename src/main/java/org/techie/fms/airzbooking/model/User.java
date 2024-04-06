package org.techie.fms.airzbooking.model;

import lombok.Data;
import org.techie.fms.airzbooking.types.UserType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private UserType userType;
}
