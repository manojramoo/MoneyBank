package com.example.MoneyBank.users;

public class Users {
	private String userName;
	private String password;
	private int iD;
	private String type;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Users(String userName, String password, int iD, String type) {
		super();
		this.userName = userName;
		this.password = password;
		this.iD = iD;
		this.type = type;
	}
	
}
