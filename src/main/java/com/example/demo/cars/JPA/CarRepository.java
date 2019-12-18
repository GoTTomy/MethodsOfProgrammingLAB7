package com.example.demo.cars.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends CrudRepository<Car, Long> {
    Car findCarByMake(String S);
    Car findCarByRegistration(String n);
}
