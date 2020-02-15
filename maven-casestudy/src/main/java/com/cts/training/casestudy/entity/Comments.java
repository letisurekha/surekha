package com.cts.training.casestudy.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Table(name = "comments")
public class Comments {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name="mediaId")
	private Integer mediaId;
	
	@Column
	private Integer userId;
	
	@Column
	private String comments;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdOn;
	
	
	
	
	
	public Comments() {
	}
	

	public Comments(Integer id, Integer mediaId, Integer userId, String comments, LocalDateTime createdOn) {

		this.id = id;
		this.mediaId = mediaId;
		this.userId = userId;
		this.comments = comments;
		this.createdOn = createdOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", mediaId=" + mediaId + ", userId=" + userId + ", comments=" + comments
				+ ", createdOn=" + createdOn + "]";
	}
	
	

}
