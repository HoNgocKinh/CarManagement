package com.httt.car_management.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.httt.car_management.common.BaseEntity;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "staff_id")
	private Long staffId;
	
	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "total")
	private double total;

	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
	private List<BillDetailEntity> billdetails = new ArrayList<>(20);
	
	public Long getStaffId() {
		return staffId;
	}
	
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<BillDetailEntity> getBilldetails() {
		return billdetails;
	}

	public void setBilldetails(List<BillDetailEntity> billdetails) {
		this.billdetails = billdetails;
	}
}
