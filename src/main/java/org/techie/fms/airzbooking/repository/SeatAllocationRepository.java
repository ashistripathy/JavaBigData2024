package org.techie.fms.airzbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techie.fms.airzbooking.model.SeatAllocation;
@Repository
public interface SeatAllocationRepository extends JpaRepository<SeatAllocation,Long> {
}
