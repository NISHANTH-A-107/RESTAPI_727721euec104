package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String bookname;
	private float price;
	private int quantity;
	private String authorname;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String bookname, float price, int quantity, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.authorname = authorname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	public void compare(Book b) {
		if(b.getBookname() != null)
		{
			this.setBookname(b.getBookname());
		}
		if(b.getPrice() != this.getPrice())
		{
			this.setPrice(b.getPrice());
		}
		if(b.getQuantity() != this.getQuantity())
		{
			this.setQuantity(b.getQuantity());
		}
		if(b.getAuthorname() != null)
		{
			this.setAuthorname(b.getAuthorname());
		}
	}
}
