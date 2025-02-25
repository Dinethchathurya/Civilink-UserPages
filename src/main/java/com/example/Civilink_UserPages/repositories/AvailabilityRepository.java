package com.example.Civilink_UserPages.repositories;

import com.example.Civilink_UserPages.entities.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, String> {
    Availability findByUserId(String userId);
}
