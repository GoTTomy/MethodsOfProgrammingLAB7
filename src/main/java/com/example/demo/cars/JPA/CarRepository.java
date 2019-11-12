package com.example.demo.cars.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends CrudRepository<Car, Long> {
    public Car findCarByMake(String S);
    public Car findCarByRegistration(String n);
    public void updateCarById(String mark, String registration, Long id);
}
