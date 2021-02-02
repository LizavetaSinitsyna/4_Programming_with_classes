package by.epam.module4.part1.task10;

import java.util.Scanner;
import java.time.LocalTime;

/*10. ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- 
������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
����� � �������:
a) ������ ������ ��� ��������� ������ ����������;
b) ������ ������ ��� ��������� ��� ������;
c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
*/

public class UserDataInput {
	Scanner scanner = new Scanner(System.in);

	public String requestStringInput(String message) {
		String input;

		System.out.println(message);
		System.out.println(">>");
		input = scanner.nextLine();

		return input;
	}

	public LocalTime requestTime(String message) {
		LocalTime inputTime;
		int hours;
		int minutes;

		System.out.println(message);

		System.out.println("������� ����: ");
		hours = requestInt(">>");
		System.out.println("������� ������: ");
		minutes = requestInt(">>");

		inputTime = LocalTime.of(hours, minutes);

		return inputTime;
	}

	public int requestInt(String message) {
		int input;

		do {
			System.out.println(message);
			while (!scanner.hasNextInt()) {
				scanner.nextLine();
				System.out.println(message);
			}
			input = scanner.nextInt();
			scanner.nextLine();
		} while (input < 0);

		return input;
	}

}
