package by.epam.module4.part1.task6;

import java.util.Scanner;

/*6. Составьте описание класса для представления времени. 
 Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
 допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

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
