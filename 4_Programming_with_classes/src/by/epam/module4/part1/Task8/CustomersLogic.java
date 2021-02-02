package by.epam.module4.part1.Task8;

import java.util.ArrayList;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class CustomersLogic {

	public CustomersList sortInAlphabeticalOrder(CustomersList list) {
		sortInAlphabeticalOrderBySurname(list);
		Customer[] customers = list.getCustomers();
		int counter = 0;
		for (int i = 0; i < customers.length - 1; i++) {

			if (customers[i].getSurname().compareTo(customers[i + 1].getSurname()) == 0) {
				counter++;
			} else {
				if (counter > 0) {
					sortInAlphabeticalOrderByName(list, i - counter, i);
				}
				counter = 0;
			}

		}

		if (counter > 0) {
			sortInAlphabeticalOrderByName(list, customers.length - 1 - counter, customers.length - 1);
		}

		counter = 0;
		
		for (int i = 0; i < customers.length - 1; i++) {

			if (customers[i].getName().compareTo(customers[i + 1].getName()) == 0) {
				counter++;
			} else {
				if (counter > 0) {
					sortInAlphabeticalOrderByMiddleName(list, i - counter, i);
				}
				counter = 0;
			}

		}

		if (counter > 0) {
			sortInAlphabeticalOrderByMiddleName(list, customers.length - 1 - counter, customers.length - 1);
		}

		return list;

	}

	public CustomersList sortInAlphabeticalOrderBySurname(CustomersList list) {
		Customer[] customers = list.getCustomers();
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length - i - 1; j++) {
				if (customers[j].getSurname().compareTo(customers[j + 1].getSurname()) > 0) {
					swap(customers, j, j + 1);
				}
			}
		}

		return list;
	}

	public CustomersList sortInAlphabeticalOrderByName(CustomersList list, int startIndex, int endIndex) {
		Customer[] customers = list.getCustomers();
		for (int i = startIndex; i <= endIndex; i++) {
			for (int j = startIndex; j < endIndex - (i - startIndex); j++) {
				if (customers[j].getName().compareTo(customers[j + 1].getName()) > 0) {
					swap(customers, j, j + 1);
				}
			}
		}

		return list;
	}

	public CustomersList sortInAlphabeticalOrderByMiddleName(CustomersList list, int startIndex, int endIndex) {
		Customer[] customers = list.getCustomers();
		for (int i = startIndex; i <= endIndex; i++) {
			for (int j = startIndex; j < endIndex - (i - startIndex); j++) {
				if (customers[j].getMiddleName().compareTo(customers[j + 1].getMiddleName()) > 0) {
					swap(customers, j, j + 1);
				}
			}
		}

		return list;
	}

	public ArrayList<Customer> searchCustomersByСreditCardInterval(CustomersList list, int startOfInterval,
			int endOfInterval) {
		ArrayList<Customer> result = new ArrayList<>();
		if (endOfInterval < startOfInterval) {
			int temp = endOfInterval;
			endOfInterval = startOfInterval;
			startOfInterval = temp;
		}

		for (int i = 0; i < list.getCustomers().length; i++) {
			Customer customer = list.getCustomer(i);
			if (customer.getCreditCardNumber() >= startOfInterval && customer.getCreditCardNumber() <= endOfInterval) {
				result.add(customer);
			}
		}

		return result;
	}

	public static void swap(Customer[] customers, int index1, int index2) {
		Customer temp = customers[index2];
		customers[index2] = customers[index1];
		customers[index1] = temp;
	}

}
