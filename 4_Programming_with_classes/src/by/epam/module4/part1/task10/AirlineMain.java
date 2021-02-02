package by.epam.module4.part1.task10;

import java.time.LocalTime;
import java.util.ArrayList;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
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

		airlines.add(new Airline("Москва", 250, "Boeing 737-500", LocalTime.of(13, 54),
				new String[] { "пн", "вт", "ср", "чт", "пт" }));
		airlines.add(new Airline("Москва", 355, "Boeing 737-800", LocalTime.of(16, 8),
				new String[] { "чт", "пт", "сб", "вс" }));
		airlines.add(
				new Airline("Женева", 487, "Boeing 737-300", LocalTime.of(7, 30), new String[] { "пт", "сб", "вс" }));
		airlines.add(new Airline("Рига", 987, "Embraer 195", LocalTime.of(12, 34), new String[] { "пн", "ср" }));
		airlines.add(new Airline("Вильнюс", 321, "Embraer 195-E2", LocalTime.of(8, 20), new String[] { "вт", "сб" }));

		airport = new Airport(airlines);

		show.printAllAirlinesInfo("Cписок доступных рейсов", airport);

		destination = input.requestStringInput("Пожалуйста, введите желаемый пункт назначения: ");
		show.printAllAirlinesInfo("Cписок рейсов для заданного пункта назначения",
				logic.selectAirlinesByDestinationPoint(airport, destination));

		dayOfWeek = input.requestStringInput("Пожалуйста, введите желаемый день недели: ");
		show.printAllAirlinesInfo("Cписок рейсов для заданного дня недели: ",
				logic.selectAirlinesByDayOfWeek(airport, dayOfWeek));

		time = input.requestTime("Пожалуйста, введите желаемое время отправления: ");
		show.printAllAirlinesInfo("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного: ",
				logic.selectAirlinesByDayOfWeekAndDepartureTime(airport, dayOfWeek, time));

	}

}
