package by.epam.module4.part1.task10;

import java.util.ArrayList;

/*10. ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- 
������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
����� � �������:
a) ������ ������ ��� ��������� ������ ����������;
b) ������ ������ ��� ��������� ��� ������;
c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
*/

public class Airport {
	private ArrayList<Airline> airlines;

	public Airport(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	public Airline getAirline(int i) {
		return airlines.get(i);
	}

}
