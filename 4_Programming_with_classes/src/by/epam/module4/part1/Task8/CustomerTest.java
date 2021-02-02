package by.epam.module4.part1.Task8;

import java.util.ArrayList;

/*8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � �����
toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

public class CustomerTest {
	public static void main(String[] args) {
		int border1;
		int border2;
		ArrayList<Customer> customersFoundedByCreditCard;

		CustomersLogic logic = new CustomersLogic();
		CustomerView view = new CustomerView();
		UserDataInput input = new UserDataInput();

		CustomersList customers = new CustomersList(
				new Customer[] { new Customer(44, "���������", "��������", "��������������", "�����1", 8596, 7896),
						new Customer(38, "��������", "�������", "��������", "�����2", 845, 786),
						new Customer(48, "���������", "�����", "��������", "�����3", 53468, 44346),
						new Customer(49, "���", "�������", "����������", "�����4", 5422463, 465415),
						new Customer(54, "���", "�������", "����������", "�����5", 4552, 4344) });

		System.out.println("�������� ������ �����������: ");
		view.printCustomers(customers);

		logic.sortInAlphabeticalOrder(customers);
		System.out.println("������ ����������� � ���������� �������: ");
		view.printCustomers(customers);

		border1 = input.requestIntervalBorder("������� ����� ������� ��������� ��� ������ ������ ��������� ��������: ");
		border2 = input
				.requestIntervalBorder("������� ������ ������� ��������� ��� ������ ������ ��������� ��������: ");
		customersFoundedByCreditCard = logic.searchCustomersBy�reditCardInterval(customers, border1, border2);

		System.out.println("������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������: ");
		view.printCustomers(customersFoundedByCreditCard);
	}

}
