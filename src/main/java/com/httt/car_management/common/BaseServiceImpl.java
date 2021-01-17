package com.httt.car_management.common;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl <D extends BaseDTO, E extends BaseEntity, R extends BaseRepository<E>> implements BaseService<D> {

	private BaseRepository<E> repository;
	
	@Override
	public Optional<List<D>> findAllByActive() {
		
		repository.findAllByActive();
		return null;
	}

	@Override
	public Optional<D> findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<D> findByIdAndActive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<D>> findByIds(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(D d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(D d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long id, D d) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Getter / Setter Beans
	 */
	public void setBaseRepository(BaseRepository<E> baseRepository) {
		this.repository = baseRepository;
	}
}
