package by.epam.module4.part1.task10;

import java.time.LocalTime;
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

public class AirlineMain {
	public static void main(String[] args) {
		AirlinesLogic logic = new AirlinesLogic();
		AirlinesView show = new AirlinesView();
		ArrayList<Airline> airlines = new ArrayList<>();
		UserDataInput input = new UserDataInput();

		Airport airport;
		String destination;
		String dayOfWeek;
		LocalTime time;

		airlines.add(new Airline("������", 250, "Boeing 737-500", LocalTime.of(13, 54),
				new String[] { "��", "��", "��", "��", "��" }));
		airlines.add(new Airline("������", 355, "Boeing 737-800", LocalTime.of(16, 8),
				new String[] { "��", "��", "��", "��" }));
		airlines.add(
				new Airline("������", 487, "Boeing 737-300", LocalTime.of(7, 30), new String[] { "��", "��", "��" }));
		airlines.add(new Airline("����", 987, "Embraer 195", LocalTime.of(12, 34), new String[] { "��", "��" }));
		airlines.add(new Airline("�������", 321, "Embraer 195-E2", LocalTime.of(8, 20), new String[] { "��", "��" }));

		airport = new Airport(airlines);

		show.printAllAirlinesInfo("C����� ��������� ������", airport);

		destination = input.requestStringInput("����������, ������� �������� ����� ����������: ");
		show.printAllAirlinesInfo("C����� ������ ��� ��������� ������ ����������",
				logic.selectAirlinesByDestinationPoint(airport, destination));

		dayOfWeek = input.requestStringInput("����������, ������� �������� ���� ������: ");
		show.printAllAirlinesInfo("C����� ������ ��� ��������� ��� ������: ",
				logic.selectAirlinesByDayOfWeek(airport, dayOfWeek));

		time = input.requestTime("����������, ������� �������� ����� �����������: ");
		show.printAllAirlinesInfo("C����� ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������: ",
				logic.selectAirlinesByDayOfWeekAndDepartureTime(airport, dayOfWeek, time));

	}

}
