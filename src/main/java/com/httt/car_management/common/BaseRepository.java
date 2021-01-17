package com.httt.car_management.common;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository <E extends BaseEntity> extends JpaRepository<E, Long>{
	
//	public Optional<List<E>> findAllByActive(boolean active);
}
