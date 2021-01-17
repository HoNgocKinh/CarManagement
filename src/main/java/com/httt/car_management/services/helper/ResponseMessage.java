package com.httt.car_management.services.helper;

public class ResponseMessage {
	
	private String status = "";
	private String data = "";
	private String message = "";
	
	public ResponseMessage() {
		
	}
	
	public ResponseMessage(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
