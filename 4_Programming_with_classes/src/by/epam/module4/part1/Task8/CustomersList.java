package by.epam.module4.part1.Task8;

/*8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � �����
toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

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
