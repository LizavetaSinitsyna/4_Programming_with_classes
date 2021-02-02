package by.epam.module4.part1.Task8;

import java.util.ArrayList;

/*8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � �����
toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

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
