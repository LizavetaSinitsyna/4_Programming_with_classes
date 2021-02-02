package by.epam.module4.part1.task9;

import java.util.ArrayList;
import java.util.Arrays;

/*9. ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � 
����� toString(). ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
����� � �������:
a) ������ ���� ��������� ������;
b) ������ ����, ���������� �������� �������������;
c) ������ ����, ���������� ����� ��������� ����. 
*/

public class BooksViewInfo {
	public void printConcreteBookInfo(Book book) {
		System.out.println("Book: id = " + book.getId() + ", name = " + book.getName() + ", authors = "
				+ Arrays.toString(book.getAuthors()) + ", publisher = " + book.getPublisher() + ", yearOfPublishing = "
				+ book.getYearOfPublishing() + ", pages = " + book.getPages() + ", price = " + book.getPrice()
				+ ", bindingType = " + book.getBindingType() + ".");
	}

	public void printAllBooksInfo(String message, Library library) {
		System.out.println(message);
		for (int i = 0; i < library.getBooks().size(); i++) {
			printConcreteBookInfo(library.getBook(i));
		}
	}

	public void printSelectedBooksInfo(String message, ArrayList<Book> books) {
		System.out.println(message);
		for (int i = 0; i < books.size(); i++) {
			printConcreteBookInfo(books.get(i));
		}
	}

}
