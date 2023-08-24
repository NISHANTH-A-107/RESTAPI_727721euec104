package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {
	
	@Id
	private int packageId;
	
	private String status;
	private int senderId;
	private int receiverId;
	private int carrierId;
	private int cost;
	
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delivery(int packageId, String status, int senderId, int receiverId,int carrierid,int cost) {
		super();
		this.packageId = packageId;
		this.status = status;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.carrierId = carrierid;
		this.cost = cost;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public int getCarrierid() {
		return carrierId;
	}

	public void setCarrierid(int carrierid) {
		this.carrierId = carrierid;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
