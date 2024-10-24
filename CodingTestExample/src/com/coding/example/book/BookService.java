package com.coding.example.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getBooks(){
		List<Book> books =  new BookDAO().getBookList();
		Collections.sort(books, new MyComparator());
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBooks());
	}

}

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookName().compareTo(o2.getBookName());
	}
	
}
