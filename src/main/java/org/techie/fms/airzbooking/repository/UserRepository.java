package org.techie.fms.airzbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techie.fms.airzbooking.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
