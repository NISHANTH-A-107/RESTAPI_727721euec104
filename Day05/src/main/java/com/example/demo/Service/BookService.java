package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	
	//Adding multiple data
	public List<Book> postbooks(List<Book> b){
		return (List<Book>)br.saveAll(b);
	}
	
	//Adding a single data
	public Book postbook(Book b) {
		return br.save(b);
	}
	
	//Getting all list
	public List<Book> getbooks(){
		return br.findAll();
	}
	
	//Getting an entity by Id
	public Optional<Book> getBook(int id) {
		return br.findById(id);
	}
	
	public Book getonebook(int id) {
		return br.getReferenceById(id);
	}
	//Updating the list with authorname updated
//	public String updatebook(int id,String val) {
////		Book tempBook = br.getReferenceById(id);
////		tempBook.setAuthorname(val);
////		br.save(tempBook);
//		if(br.existsById(id))
//		{
//			br.getReferenceById(id).setAuthorname(val);
//			br.save(br.getReferenceById(id));
//			return "Updated succesfully";
//		}
//		else
//			return "No data found for given id";
//	}
	
	public String updatebook(int id,Book b) {
		if(br.existsById(id))
		{
			getonebook(id).compare(b);
			br.save(getonebook(id));
			return "Updated";
		}
		else
			return "No data found";
	}
	
	public String remove(int id) {
		if(br.existsById(id))
		{
			br.deleteById(id);
			return "deleted succesfully";
		}
		return "no id found";
	}
}
