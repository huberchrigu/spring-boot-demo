package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPersonRepository extends JpaRepository<JpaPerson, Long> {
}
