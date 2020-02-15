package com.cts.training.casestudy.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name = "media")
public class Media {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name = "userId")
	private String userId;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String mimetype;
	
	@Column
	private String size;
	
	@Column
	private String posterFile;
	
	@Column
	private String hide;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	
	public Media() {
	}


	public Media(Integer id, String userId, String title, String description, String mimetype, String size,
			String posterFile, String hide, LocalDateTime createdOn, LocalDateTime updatedOn) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.mimetype = mimetype;
		this.size = size;
		this.posterFile = posterFile;
		this.hide = hide;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMimetype() {
		return mimetype;
	}


	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getPosterFile() {
		return posterFile;
	}


	public void setPosterFile(String posterFile) {
		this.posterFile = posterFile;
	}


	public String getHide() {
		return hide;
	}


	public void setHide(String hide) {
		this.hide = hide;
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


	@Override
	public String toString() {
		return "Media [id=" + id + ", userId=" + userId + ", title=" + title + ", description=" + description
				+ ", mimetype=" + mimetype + ", size=" + size + ", posterFile=" + posterFile + ", hide=" + hide
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
	
	

}
