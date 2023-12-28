package com.example.CRUD.Practice.repository;

import com.example.CRUD.Practice.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    // You can add custom query methods if needed
}
