package com.httt.car_management.repositories;

import org.springframework.stereotype.Repository;

import com.httt.car_management.common.BaseRepository;
import com.httt.car_management.entities.CarEntity;

@Repository
public interface CarRepository extends BaseRepository<CarEntity> {
	
}
