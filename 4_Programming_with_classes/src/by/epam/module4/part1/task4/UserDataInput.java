package by.epam.module4.part1.task4;

/*�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������. 
�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� 
������ ���� ����������� �� ������� �����������.*/

import java.util.Scanner;

public class UserDataInput {
	
	
	public int readTrainNumber(String message) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.println(message);

			while (!scan.hasNextInt()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextInt();
			scan.nextLine();
		} while (number < 1);

		return number;
	}
}
