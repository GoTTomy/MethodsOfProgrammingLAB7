package com.example.demo.controllers.JPA;

import com.example.demo.cars.JPA.Car;
import com.example.demo.cars.JPA.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("chuj")
public class CarController{
    @Autowired
    CarRepository repository;

    @GetMapping(value = "/findCarByMake/{mark}", produces = "application/json")
    public Car findCarByMake(@PathVariable String mark){
        System.out.println("Searching for car via mark");
        return repository.findCarByMake(mark);
    }

    @GetMapping(value = "/findCarByReg/{reg}", produces = "application/json")
    public Car findCarByRegistration(@PathVariable String reg){
        System.out.println("Searching for car via reg number");
        return repository.findCarByRegistration(reg);
    }

    @PostMapping("add")
    public void addCar(@RequestBody Car car){
        repository.save(car);
        System.out.println("Car " + car + "has been sucesfully added");
    }

    @DeleteMapping("delete/{id}")
    public void deleteCar(@PathVariable Long id){
        repository.delete(repository.findById(id).get());
        System.out.println("Deleted car" + repository.findById(id));
    }

    @PutMapping("update/{id}/{mark}/{registration}")
    public void updateCar(@PathVariable Long id, String mark, String registration){
        Car car = repository.findById(id).get();
        car.setMake(mark);
        car.setRegistration(registration);
    }


}
