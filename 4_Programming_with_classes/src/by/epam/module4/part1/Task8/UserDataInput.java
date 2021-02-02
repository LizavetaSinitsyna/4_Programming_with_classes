package by.epam.module4.part1.Task8;

import java.util.Scanner;

/*8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы и метод
toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
«адать критерии выбора данных и вывести эти данные на консоль.
 ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
Ќайти и вывести:
a) список покупателей в алфавитном пор€дке;
b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале*/

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
