package com.capstone.EmpowerMe.repositories;


import com.capstone.EmpowerMe.models.Affirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffirmationRepository extends JpaRepository<Affirmation, Long> {
}
