package com.example.demo.controllers.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("getbyMark/{mark}")
    public void findCarByMark(@PathVariable String mark){
        String sql = "SELECT * FROM car WHERE mark ='"+ mark + "'";
        jdbcTemplate.execute(sql);
    }
}
