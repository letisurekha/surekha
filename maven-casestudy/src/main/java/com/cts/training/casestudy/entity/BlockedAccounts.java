package com.cts.training.casestudy.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "blockedAccounts")
public class BlockedAccounts {
	
	
	private Integer userId;
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer blockedUserId;
	
	
	
	
	public BlockedAccounts() {
	}


	public BlockedAccounts(Integer userId, Integer blockedUserId) {
		
		this.userId = userId;
		this.blockedUserId = blockedUserId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getBlockedUserId() {
		return blockedUserId;
	}


	public void setBlockedUserId(Integer blockedUserId) {
		this.blockedUserId = blockedUserId;
	}


	@Override
	public String toString() {
		return "BlockedAccounts [userId=" + userId + ", blockedUserId=" + blockedUserId + "]";
	}
	
	
	

}
