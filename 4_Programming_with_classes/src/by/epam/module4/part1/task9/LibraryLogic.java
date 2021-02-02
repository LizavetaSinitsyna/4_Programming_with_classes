package by.epam.module4.part1.task9;

import java.util.ArrayList;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года. 
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
