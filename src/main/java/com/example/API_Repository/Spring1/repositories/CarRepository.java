package com.example.API_Repository.Spring1.repositories;


import com.example.API_Repository.Spring1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
