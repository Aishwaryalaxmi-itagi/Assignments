package packageTwo;

import java.util.Comparator;

import packageOne.Book;

public class CompareBooksByPrice implements Comparator<Book> {
	@Override
	public int compare(Book bk1, Book bk2) {
		if (bk1.getPrice() > bk2.getPrice())
			return 1;
		else if (bk1.getPrice() < bk2.getPrice())
			return -1;
		else
			return 0;
	}
}
