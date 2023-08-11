package com.general;
//segundo
public class Database {
	
	private String url;
	private String drivers;
	private String user;
	private String password;
	
	
	public Database() {
		
		this.url = "jdbc:oracle:thin:@localhost:1521:xe";
		this.drivers = "oracle.jdbc.OracleDriver";
		this.user = "oscar";
		this.password = "admin";
		
	}


	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDrivers() {
		return drivers;
	}


	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
