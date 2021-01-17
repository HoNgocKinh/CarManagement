package com.httt.car_management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.httt.car_management.common.BaseEntity;

@Entity
@Table(name = "car")
public class CarEntity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "bought_price")
	private float boughtPrice;
	
	@Column(name = "sell_price")
	private float sellPrice;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;
	
	@Column(name = "from_country")
	private String fromCountry;

	@Column(name = "image")
	private String image;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getBoughtPrice() {
		return boughtPrice;
	}

	public void setBoughtPrice(float boughtPrice) {
		this.boughtPrice = boughtPrice;
	}

	public float getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
