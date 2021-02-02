package by.epam.module4.part1.Task8;

import java.util.Scanner;

/*8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � �����
toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

public class UserDataInput {
	public int requestIntervalBorder(String message) {
		int border;

		System.out.println(message);

		border = readInt(">>");

		return border;

	}

	public int readInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println(message);
		}
		number = scanner.nextInt();
		return number;
	}

}
