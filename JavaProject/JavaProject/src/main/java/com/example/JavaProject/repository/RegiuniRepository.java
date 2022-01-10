package com.example.JavaProject.repository;

import com.example.JavaProject.model.Regiuni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegiuniRepository extends JpaRepository<Regiuni, Long> {
}
