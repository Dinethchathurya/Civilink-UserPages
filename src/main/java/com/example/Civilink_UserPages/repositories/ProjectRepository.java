package com.example.Civilink_UserPages.repositories;

import com.example.Civilink_UserPages.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
    List<Project> findByUserId(String userId);

}
