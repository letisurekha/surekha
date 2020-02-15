package com.cts.training.casestudy.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Table(name = "newsFeed")
public class NewsFeed {
	

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer userId;
	
	private Integer mediaId;
	
	@Column(name="feed")
	private String feed;
	
	@CreationTimestamp
	@Column
	private LocalDateTime CreatedOn;
	
	
	
	public NewsFeed() {
	}


	public NewsFeed(Integer id, Integer userId, String feed, LocalDateTime createdOn, Integer mediaId) {
		this.id = id;
		this.userId = userId;
		this.feed = feed;
		CreatedOn = createdOn;
		this.mediaId = mediaId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getFeed() {
		return feed;
	}


	public void setFeed(String feed) {
		this.feed = feed;
	}


	public LocalDateTime getCreatedOn() {
		return CreatedOn;
	}


	public void setCreatedOn(LocalDateTime createdOn) {
		CreatedOn = createdOn;
	}


	public Integer getMediaId() {
		return mediaId;
	}


	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}


	@Override
	public String toString() {
		return "NewsFeed [id=" + id + ", userId=" + userId + ", feed=" + feed + ", CreatedOn=" + CreatedOn
				+ ", mediaId=" + mediaId + "]";
	}
	
	 
	

}
