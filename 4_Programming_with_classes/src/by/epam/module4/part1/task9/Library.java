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

public class Library {
	private ArrayList<Book> books;

	public Library(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public Book getBook(int i) {
		return books.get(i);
	}
	
}
