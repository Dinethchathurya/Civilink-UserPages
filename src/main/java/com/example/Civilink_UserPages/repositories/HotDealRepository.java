package com.example.Civilink_UserPages.repositories;

import com.example.Civilink_UserPages.entities.HotDeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotDealRepository extends JpaRepository<HotDeal, String> {
    List<HotDeal> findByUserId(String userId);
}

