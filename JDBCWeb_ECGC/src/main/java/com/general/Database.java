package com.general;

public class Database {
	
	private String url;
	private String driver;
	private String user;
	private String password;
	
	public Database() {
		this.url= "jdbc:oracle:thin:@localhost:1521:xe";
		this.driver="oracle.jdbc.OracleDriver";
		this.user="Emilio";
		this.password="admin";
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
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

	@Override
	public String toString() {
		return "Database [url=" + url + ", driver=" + driver + ", user=" + user + ", password=" + password + "]";
	}

}
