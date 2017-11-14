package com.perudo.dto;

public class UserDeviceDto extends GenericDto {

	private int userId;
	private String deviceId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	

	
	
}
