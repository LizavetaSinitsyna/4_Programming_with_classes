package by.epam.module4.part1.task9;

import java.util.Scanner;

/*9. ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � 
����� toString(). ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
����� � �������:
a) ������ ���� ��������� ������;
b) ������ ����, ���������� �������� �������������;
c) ������ ����, ���������� ����� ��������� ����. 
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
