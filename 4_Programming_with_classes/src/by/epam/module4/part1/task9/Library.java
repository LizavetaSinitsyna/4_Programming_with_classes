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
