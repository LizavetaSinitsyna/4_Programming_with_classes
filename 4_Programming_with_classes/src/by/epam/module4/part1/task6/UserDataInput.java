package by.epam.module4.part1.task6;

import java.util.Scanner;

/*6. ��������� �������� ������ ��� ������������� �������. 
 ������������ ����������� ��������� ������� � ��������� ��� ��������� ����� (���, ������, �������) � ��������� 
 ������������ �������� ��������. � ������ ������������ �������� ����� ���� ��������������� � �������� 0. 
 ������� ������ ��������� ������� �� �������� ���������� �����, ����� � ������.*/

public class UserDataInput {

	public int requestValue(String message) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number;

		System.out.println(message);

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println(message);
		}

		number = scan.nextInt();

		return number;

	}

}
