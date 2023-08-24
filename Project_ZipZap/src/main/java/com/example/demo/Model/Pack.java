package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pack")
public class Pack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int packageId;
	private String senderId;
	private String receiverId;
	private String status;
	private int cost;
	
	public Pack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pack(int packageId, String senderId, String receiverId, String status, int cost) {
		super();
		this.packageId = packageId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.status = status;
		this.cost = cost;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void compare(Pack p) {
		if(p.getSenderId() != null)
		{
			this.setSenderId(p.getSenderId());
		}
		if(p.getReceiverId() != null)
		{
			this.setReceiverId(p.getReceiverId());
		}
		if(p.getStatus() != null)
		{
			this.setStatus(p.getStatus());
		}
		if(p.getCost() != this.getCost())
		{
			this.setCost(p.getCost());
		}
	}
	
}

