package packageTwo;

import java.util.Comparator;

import packageOne.Book;

public class CompareBooksByName implements Comparator<Book> {
	public int compare(Book bk1, Book bk2) {
		return bk1.getName().compareTo(bk2.getName());
	}
}
