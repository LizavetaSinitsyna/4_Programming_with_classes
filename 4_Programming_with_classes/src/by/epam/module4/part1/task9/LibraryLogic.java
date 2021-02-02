package by.epam.module4.part1.task9;

import java.util.ArrayList;

/*9. ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � 
����� toString(). ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
����� � �������:
a) ������ ���� ��������� ������;
b) ������ ����, ���������� �������� �������������;
c) ������ ����, ���������� ����� ��������� ����. 
*/

public class LibraryLogic {
	public ArrayList<Book> selectBooksByAuthor(Library library, String author) {
		ArrayList<Book> books = new ArrayList<>();
		String[] authors;

		for (int i = 0; i < library.getBooks().size(); i++) {
			authors = library.getBook(i).getAuthors();
			for (int j = 0; j < authors.length; j++) {
				if (authors[j].equalsIgnoreCase(author)) {
					books.add(library.getBook(i));
				}
			}
		}
		return books;
	}

	public ArrayList<Book> selectBooksByPublisher(Library library, String publisher) {
		ArrayList<Book> books = new ArrayList<>();

		for (int i = 0; i < library.getBooks().size(); i++) {

			if (library.getBook(i).getPublisher().equalsIgnoreCase(publisher)) {
				books.add(library.getBook(i));
			}

		}
		return books;
	}

	public ArrayList<Book> selectBooksByPublishingYear(Library library, int year) {
		ArrayList<Book> books = new ArrayList<>();

		for (int i = 0; i < library.getBooks().size(); i++) {

			if (library.getBook(i).getYearOfPublishing() > year) {
				books.add(library.getBook(i));
			}
		}
		return books;
	}
}
