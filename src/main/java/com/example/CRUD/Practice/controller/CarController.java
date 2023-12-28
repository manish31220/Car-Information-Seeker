package com.example.CRUD.Practice.controller;

import com.example.CRUD.Practice.model.CarModel;
import com.example.CRUD.Practice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/models")
    public List<CarModel> getAllCarModels() {
        return carService.getAllCarModels();
    }


}
