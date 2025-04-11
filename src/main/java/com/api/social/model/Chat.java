package com.api.social.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chats")
public class Chat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int user1_id;
	private int user2_id;
	private String user1_name;
	private String user2_name;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUser1_id() {
		return this.user1_id;
	}
	public void setUSer1_id(int id) {
		this.user1_id = id;
	}
	
	public int getUser2_id() {
		return this.user2_id;
	}
	public void setUSer2_id(int id) {
		this.user2_id = id;
	}
	
	public String getUser1_name() {
		return this.user1_name;
	}
	public void setUser1_name(String user1_name) {
		this.user1_name = user1_name;
	}
	
	public String getUser2_name() {
		return this.user2_name;
	}
	public void setUser2_name(String user2_name) {
		this.user2_name = user2_name;
	}

}
