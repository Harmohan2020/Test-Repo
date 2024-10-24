package com.coding.example.book;

import java.util.Objects;

public class Book {
	
	private int id;
	private String bookName;
	private int pages;
	
	public Book() {}
	public Book(int id, String bookName, int pages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.pages = pages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", pages=" + pages + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookName, id, pages);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && id == other.id && pages == other.pages;
	}
	
	
	

}
