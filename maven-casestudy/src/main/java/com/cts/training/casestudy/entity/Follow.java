package com.cts.training.casestudy.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "follow")
public class Follow {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer userId;
	 
	@Column(name="followersId")
	private Integer followersId;
	
	
	
	public Follow() {
	}

	public Follow(Integer userId, Integer followersId) {
		
		this.userId = userId;
		this.followersId = followersId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowersId() {
		return followersId;
	}

	public void setFollowersId(Integer followersId) {
		this.followersId = followersId;
	}

	@Override
	public String toString() {
		return "Follow [userId=" + userId + ", followersId=" + followersId + "]";
	}
	
	

}
