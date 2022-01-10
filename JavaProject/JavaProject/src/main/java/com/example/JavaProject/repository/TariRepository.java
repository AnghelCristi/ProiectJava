package com.example.JavaProject.repository;

import com.example.JavaProject.model.Tari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariRepository extends JpaRepository<Tari, Long> {
}
