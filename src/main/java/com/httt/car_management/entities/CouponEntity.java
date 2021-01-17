package com.httt.car_management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.httt.car_management.common.BaseEntity;

@Entity
@Table(name = "coupon")
public class CouponEntity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "reduce")
	private double reduce;
	
	@Column(name = "unit")
	private String unit;

	public double getReduce() {
		return reduce;
	}

	public void setReduce(double reduce) {
		this.reduce = reduce;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
