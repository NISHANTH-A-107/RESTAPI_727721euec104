package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@PostMapping("add")
	public List<Book> addbooks(@RequestBody List<Book> b){
		return bs.postbooks(b);
	}
	
	@PostMapping("addone")
	public Book addbook(@RequestBody Book b) {
		return bs.postbook(b);
	}
	
	@GetMapping("showall")
	public List<Book> showbooks(){
		return bs.getbooks();
	}
	
	@PutMapping("update")
	public String changebook(@RequestParam int id,@RequestBody Book b) {
		return bs.updatebook(id, b);
	}
	
	@DeleteMapping("delete")
	public String deletebook(@RequestParam int id) {
		return bs.remove(id);
	}
}
