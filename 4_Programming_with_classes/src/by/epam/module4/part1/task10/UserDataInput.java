package by.epam.module4.part1.task10;

import java.util.Scanner;
import java.time.LocalTime;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
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

		System.out.println("Введите часы: ");
		hours = requestInt(">>");
		System.out.println("Введите минуты: ");
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
