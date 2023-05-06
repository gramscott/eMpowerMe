package com.final_project.EmpwrMe.repositories;


import com.final_project.EmpwrMe.models.Affirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffirmationRepository extends JpaRepository<Affirmation, Long> {
}
