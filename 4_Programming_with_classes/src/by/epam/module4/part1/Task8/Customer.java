package by.epam.module4.part1.Task8;

/*8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � �����
toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
����� � �������:
a) ������ ����������� � ���������� �������;
b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������*/

public class Customer {
	private long id;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Customer(long id, String surname, String name, String middleName, String address, int creditCardNumber,
			int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}


	public Customer(long id, String surname, String name, String middleName, String address) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer: id = " + id + ", surname = " + surname + ", name = " + name + ", middleName = " + middleName
				+ ", address = " + address + ", creditCardNumber = " + creditCardNumber + ", bankAccountNumber = "
				+ bankAccountNumber + ".";
	}

}
