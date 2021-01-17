package com.httt.car_management.common;

import java.io.Serializable;
import java.time.ZonedDateTime;

import com.sun.istack.NotNull;

public class BaseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Long id;
	
	private ZonedDateTime createdAt;
	
	private ZonedDateTime updatedAt;
	
	private boolean active;
	
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
