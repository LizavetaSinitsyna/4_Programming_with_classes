package by.epam.module4.part1.task10;

import java.util.Arrays;
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

public class AirlinesView {
	public void printConcreteAirlineInfo(Airline airline) {
		System.out.println("����� ����� " + airline.getFlightNumber() + ", ����� ����������: "
				+ airline.getDestinationPoint() + ", ��� ��������: " + airline.getFlightType() + ", ����� �����������: "
				+ airline.getDepartureTime() + ", ��� ������: " + Arrays.toString(airline.getDaysOfWeek()) + ".");
	}

	public void printAllAirlinesInfo(String message, ArrayList<Airline> airlines) {
		System.out.println(message);

		if (airlines.size() == 0) {
			System.out.println("����� �� �������� ���������� �� �������!");
			return;
		}

		for (int i = 0; i < airlines.size(); i++) {
			printConcreteAirlineInfo(airlines.get(i));
		}
	}

	public void printAllAirlinesInfo(String message, Airport airport) {
		System.out.println(message);

		if (airport.getAirlines().size() == 0) {
			System.out.println("����� �� �������� ���������� �� �������!");
			return;
		}

		for (int i = 0; i < airport.getAirlines().size(); i++) {
			printConcreteAirlineInfo(airport.getAirline(i));
		}
	}

}
