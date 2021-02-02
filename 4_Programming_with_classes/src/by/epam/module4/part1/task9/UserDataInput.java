package by.epam.module4.part1.task9;

import java.util.Scanner;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года. 
*/

public class UserDataInput {
	private Scanner scanner = new Scanner(System.in);

	public String requestAuthor(String message) {
		String author;

		System.out.println(message);

		author = scanner.nextLine();

		return author;
	}

	public String requestPublisher(String message) {
		String publisher;

		System.out.println(message);

		publisher = scanner.nextLine();

		return publisher;
	}

	public int requestPublishingYear(String message) {
		int year;

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			System.out.println(">>");
			scanner.nextLine();
		}

		year = scanner.nextInt();

		return year;
	}
}
