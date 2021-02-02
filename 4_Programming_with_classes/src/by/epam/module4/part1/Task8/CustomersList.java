package by.epam.module4.part1.Task8;

/*8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы и метод
toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
«адать критерии выбора данных и вывести эти данные на консоль.
 ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
Ќайти и вывести:
a) список покупателей в алфавитном пор€дке;
b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале*/

public class CustomersList {
	private Customer[] customers;

	public CustomersList(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	public Customer getCustomer(int i) {
		return customers[i];
	}
	

}
