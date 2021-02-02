package by.epam.module4.part1.Task8;

import java.util.ArrayList;

/*8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы и метод
toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
«адать критерии выбора данных и вывести эти данные на консоль.
 ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
Ќайти и вывести:
a) список покупателей в алфавитном пор€дке;
b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале*/

public class CustomerView {
	public void printCustomers(CustomersList list) {
		for (int i = 0; i < list.getCustomers().length; i++) {
			printConcreteCustomerInfo(list.getCustomer(i));
		}
	}

	public void printConcreteCustomerInfo(Customer customer) {
		System.out.println("Customer: id = " + customer.getId() + ", surname = " + customer.getSurname() + ", name = "
				+ customer.getName() + ", middleName = " + customer.getMiddleName() + ", address = "
				+ customer.getAddress() + ", creditCardNumber = " + customer.getCreditCardNumber()
				+ ", bankAccountNumber = " + customer.getBankAccountNumber() + ".");
	}

	public void printCustomers(ArrayList<Customer> list) {
		for (int i = 0; i < list.size(); i++) {
			printConcreteCustomerInfo(list.get(i));
		}
	}

}
