package by.epam.module4.part1.task7;

import java.util.Scanner;

/*7. ������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, 
���������� �������, ��������� � ����� ����������� ������.*/

public class UserDataInput {

	public Point requestCoordinates(String message) {
		Point point;
		double x;
		double y;
		System.out.println(message);
		x = readDouble("x>> ");
		y = readDouble("y>> ");

		point = new Point(x, y);

		return point;

	}

	public static double readDouble(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double number;

		do {
			System.out.println(message);

			while (!scan.hasNextDouble()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextDouble();
			scan.nextLine();
		} while (!�heckDoubleValidation(number));

		return number;
	}

	public static boolean �heckDoubleValidation(double value) {

		if (value > Double.MAX_VALUE || value < -Double.MAX_VALUE) {
			System.out.println("The value is out of range for double.");
			return false;
		}
		return true;
	}

}
