package by.epam.module4.part1.task7;

import java.util.Scanner;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан.*/

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
		} while (!сheckDoubleValidation(number));

		return number;
	}

	public static boolean сheckDoubleValidation(double value) {

		if (value > Double.MAX_VALUE || value < -Double.MAX_VALUE) {
			System.out.println("The value is out of range for double.");
			return false;
		}
		return true;
	}

}
