package com.tdchien88.designParrtens.type03_Behavioral.chap307_ObserverPattern;

public class User {
	private String email;
	private String ip;
	private LoginStatus status;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public LoginStatus getStatus() {
		return status;
	}

	public void setStatus(LoginStatus status) {
		this.status = status;
	}
}
