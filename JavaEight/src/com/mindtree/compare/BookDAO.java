package com.mindtree.compare;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(111, "Core Java"));
		books.add(new Book(222, "Web Services"));
		books.add(new Book(333, "Angular"));
		books.add(new Book(444, "Cloud"));
		books.add(new Book(555, "AWS"));
		return books;
	}

}
