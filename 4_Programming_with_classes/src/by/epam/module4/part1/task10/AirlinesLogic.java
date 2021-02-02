package by.epam.module4.part1.task10;

import java.util.ArrayList;
import java.time.LocalTime;

/*10. ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- 
������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
����� � �������:
a) ������ ������ ��� ��������� ������ ����������;
b) ������ ������ ��� ��������� ��� ������;
c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
*/

public class AirlinesLogic {
	public ArrayList<Airline> selectAirlinesByDestinationPoint(Airport airport, String destination) {
		ArrayList<Airline> result = new ArrayList<>();
		for (int i = 0; i < airport.getAirlines().size(); i++) {
			if (airport.getAirline(i).getDestinationPoint().equalsIgnoreCase(destination)) {
				result.add(airport.getAirline(i));
			}
		}
		return result;
	}

	public ArrayList<Airline> selectAirlinesByDayOfWeek(Airport airport, String dayOfWeek) {
		ArrayList<Airline> result = new ArrayList<>();
		String[] daysOfWeek;
		for (int i = 0; i < airport.getAirlines().size(); i++) {
			daysOfWeek = airport.getAirline(i).getDaysOfWeek();
			for (int j = 0; j < daysOfWeek.length; j++) {
				if (daysOfWeek[j].equalsIgnoreCase(dayOfWeek)) {
					result.add(airport.getAirline(i));
				}
			}

		}
		return result;
	}

	public ArrayList<Airline> selectAirlinesByDayOfWeekAndDepartureTime(Airport airport, String dayOfWeek,
			LocalTime departureTime) {
		ArrayList<Airline> result = new ArrayList<>();
		result = selectAirlinesByDayOfWeek(airport, dayOfWeek);
		result = selectAirlinesByDepartureTime(result, departureTime);
		return result;
	}

	public ArrayList<Airline> selectAirlinesByDepartureTime(ArrayList<Airline> airlines, LocalTime departureTime) {
		ArrayList<Airline> result = new ArrayList<>();
		for (int i = 0; i < airlines.size(); i++) {

			if (airlines.get(i).getDepartureTime().compareTo(departureTime) > 0) {
				result.add(airlines.get(i));
			}

		}
		return result;
	}

}
