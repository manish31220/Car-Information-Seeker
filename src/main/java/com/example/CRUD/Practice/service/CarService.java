// File: ApiService.java
package com.example.CRUD.Practice.service;

import com.example.CRUD.Practice.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CarService {

    private final RestTemplate restTemplate;

    @Autowired
    public CarService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromApi() {
        String apiUrl = "https://carapi.app";
        return restTemplate.getForObject(apiUrl, String.class);
    }

    public List<CarModel> getAllCarModels() {
        return null;
    }
}
