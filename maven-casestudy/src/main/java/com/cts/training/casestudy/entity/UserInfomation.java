package com.cts.training.casestudy.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;




@Table(name = "userInformation")
public class UserInfomation {
	
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
    private String dob;
	
	@Column
	private String pic;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	@Column
	private boolean enabled;
	
	
	
	
	public UserInfomation() {
	}


	public UserInfomation(Integer id, String firstName, String lastName, String userName, String password, String dob,
			String pic, LocalDateTime createdOn, LocalDateTime updatedOn, boolean enabled) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.pic = pic;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.enabled = enabled;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


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


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}


	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}


	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	@Override
	public String toString() {
		return "UserInfomation [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", dob=" + dob + ", pic=" + pic + ", createdOn=" + createdOn
				+ ", updatedOn=" + updatedOn + ", enabled=" + enabled + "]";
	}
	
	
	
	
	
	
	
	
	
	
}	
	
	