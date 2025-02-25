package com.example.Civilink_UserPages.services;

import com.example.Civilink_UserPages.entities.Availability;
import com.example.Civilink_UserPages.repositories.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    public Availability getAvailability(String userId) {
        return availabilityRepository.findByUserId(userId);
    }

    public Availability updateAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }
}

