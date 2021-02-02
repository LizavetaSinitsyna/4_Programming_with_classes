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

public class BooksMain {
	public static void main(String[] args) {
		Library library;
		LibraryLogic logic = new LibraryLogic();
		BooksViewInfo show = new BooksViewInfo();
		UserDataInput input = new UserDataInput();
		ArrayList<Book> books = new ArrayList<Book>();
		String author;
		String publisher;
		int year;

		books.add(new Book(1, "��������� �����", new String[] { "������ �� ����-��������" }, "�����", 2019, 128, 8.56,
				"������� ��������"));
		books.add(new Book(2, "����� ������ � ����� ����", new String[] { "����� �������" }, "������", 2019, 704, 28.41,
				"������� ��������"));
		books.add(new Book(3, "����� ������ � ����������� ������", new String[] { "����� �������" }, "������", 2016,
				432, 24.87, "������� ��������"));
		books.add(new Book(4, "������� Java", new String[] { "���� �����", "���� ������" }, "������", 2015, 720, 46.33,
				"������� ��������"));
		books.add(new Book(5, "�������� ��������������",
				new String[] { "���� �����", "���� ������", "���� ������", "�������� ������" }, "�����", 2019, 656,
				57.74, "������ �������"));
		library = new Library(books);

		show.printAllBooksInfo("������ ���� ����:", library);

		author = input.requestAuthor("����������, ������� ��� ������:");
		show.printSelectedBooksInfo("������ ���� ��������� ������:", logic.selectBooksByAuthor(library, author));

		publisher = input.requestAuthor("����������, ������� ������������ ������������:");
		show.printSelectedBooksInfo("������ ���� ��������� ������������:",
				logic.selectBooksByPublisher(library, publisher));

		year = input.requestPublishingYear("����������, ������� ���:");
		show.printSelectedBooksInfo("������ ����, ���������� ����� ��������� ����:",
				logic.selectBooksByPublishingYear(library, year));

	}
}
