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

		books.add(new Book(1, "Маленький принц", new String[] { "Антуан де Сент-Экзюпери" }, "Эксмо", 2019, 128, 8.56,
				"твердый переплет"));
		books.add(new Book(2, "Гарри Поттер и Кубок огня", new String[] { "Джоан Роулинг" }, "Махаон", 2019, 704, 28.41,
				"твердый переплет"));
		books.add(new Book(3, "Гарри Поттер и философский камень", new String[] { "Джоан Роулинг" }, "Махаон", 2016,
				432, 24.87, "твердый переплет"));
		books.add(new Book(4, "Изучаем Java", new String[] { "Берт Бейтс", "Кэти Сьерра" }, "Махаон", 2015, 720, 46.33,
				"твердый переплет"));
		books.add(new Book(5, "Паттерны проектирования",
				new String[] { "Берт Бейтс", "Кэти Сьерра", "Эрик Фримен", "Элизабет Робсон" }, "Питер", 2019, 656,
				57.74, "мягкая обложка"));
		library = new Library(books);

		show.printAllBooksInfo("Список всех книг:", library);

		author = input.requestAuthor("Пожалуйста, введите ФИО автора:");
		show.printSelectedBooksInfo("Список книг заданного автора:", logic.selectBooksByAuthor(library, author));

		publisher = input.requestAuthor("Пожалуйста, введите наименование издательства:");
		show.printSelectedBooksInfo("Список книг заданного издательства:",
				logic.selectBooksByPublisher(library, publisher));

		year = input.requestPublishingYear("Пожалуйста, введите год:");
		show.printSelectedBooksInfo("Список книг, выпущенных после заданного года:",
				logic.selectBooksByPublishingYear(library, year));

	}
}
