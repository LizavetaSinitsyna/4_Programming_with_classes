package by.epam.module4.part1.Task8;

import java.util.ArrayList;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class CustomerTest {
	public static void main(String[] args) {
		int border1;
		int border2;
		ArrayList<Customer> customersFoundedByCreditCard;

		CustomersLogic logic = new CustomersLogic();
		CustomerView view = new CustomerView();
		UserDataInput input = new UserDataInput();

		CustomersList customers = new CustomersList(
				new Customer[] { new Customer(44, "Булочкина", "Светлана", "Константиновна", "Адрес1", 8596, 7896),
						new Customer(38, "Булгаков", "Валерий", "Петрович", "Адрес2", 845, 786),
						new Customer(48, "Булочкина", "Мария", "Петровна", "Адрес3", 53468, 44346),
						new Customer(49, "Жук", "Василий", "Витальевич", "Адрес4", 5422463, 465415),
						new Customer(54, "Жук", "Василий", "Васильевич", "Адрес5", 4552, 4344) });

		System.out.println("Исходный список покупателей: ");
		view.printCustomers(customers);

		logic.sortInAlphabeticalOrder(customers);
		System.out.println("Список покупателей в алфавитном порядке: ");
		view.printCustomers(customers);

		border1 = input.requestIntervalBorder("Введите левую границу интервала для поиска номера кредитной карточки: ");
		border2 = input
				.requestIntervalBorder("Введите правую границу интервала для поиска номера кредитной карточки: ");
		customersFoundedByCreditCard = logic.searchCustomersByСreditCardInterval(customers, border1, border2);

		System.out.println("Список покупателей, у которых номер кредитной карточки находится в заданном интервале: ");
		view.printCustomers(customersFoundedByCreditCard);
	}

}
