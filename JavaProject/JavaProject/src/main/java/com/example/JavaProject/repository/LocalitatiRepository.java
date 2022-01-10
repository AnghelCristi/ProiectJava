package com.example.JavaProject.repository;

import com.example.JavaProject.model.Localitati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalitatiRepository extends JpaRepository<Localitati, Long> {
}
