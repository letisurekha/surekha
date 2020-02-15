package com.cts.training.casestudy.entity;

public class Authorities {
	
	private String userName;
	private String authority_Role;
	
	public Authorities() {
	}

	public Authorities(String userName, String authority_Role) {
		this.userName = userName;
		this.authority_Role = authority_Role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthority_Role() {
		return authority_Role;
	}

	public void setAuthority_Role(String authority_Role) {
		this.authority_Role = authority_Role;
	}

	@Override
	public String toString() {
		return "Authorities [userName=" + userName + ", authority_Role=" + authority_Role + "]";
	}
	
	
	

}
