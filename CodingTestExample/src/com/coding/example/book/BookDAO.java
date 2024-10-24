package com.coding.example.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBookList(){
		List<Book> bookLst = new ArrayList<>();
		bookLst.add(new Book(1,"Java",120));
		bookLst.add(new Book(2,"Python",100));
		bookLst.add(new Book(3,"React JS",170));
		bookLst.add(new Book(4,"Angular JS",190));
		return bookLst;
	}
}
