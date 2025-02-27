package com.example.Civilink_UserPages.repositories;

import com.example.Civilink_UserPages.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByNameContainingIgnoreCaseOrLocationContainingIgnoreCase(String name, String location);
}

