package com.httt.car_management.common;

import java.util.List;
import java.util.Optional;

public interface BaseService<D extends BaseDTO> {
	
	Optional<List<D>> findAllByActive();
	Optional<D> findById();
	Optional<D> findByIdAndActive();
	Optional<List<D>> findByIds(List<Long> ids);
	void save(D d);
	void update(D d);
	void update(Long id, D d);
}
