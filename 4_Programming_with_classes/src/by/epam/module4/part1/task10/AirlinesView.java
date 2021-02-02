package by.epam.module4.part1.task10;

import java.util.Arrays;
import java.util.ArrayList;

/*10. —оздать класс Airline, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- 
методы и метод toString(). —оздать второй класс, агрегирующий массив типа Airline, с подход€щими конструкторами и методами. 
«адать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначени€, номер рейса, тип самолета, врем€ вылета, дни недели.
Ќайти и вывести:
a) список рейсов дл€ заданного пункта назначени€;
b) список рейсов дл€ заданного дн€ недели;
c) список рейсов дл€ заданного дн€ недели, врем€ вылета дл€ которых больше заданного.
*/

public class AirlinesView {
	public void printConcreteAirlineInfo(Airline airline) {
		System.out.println("Ќомер рейса " + airline.getFlightNumber() + ", ѕункт назначени€: "
				+ airline.getDestinationPoint() + ", тип самолета: " + airline.getFlightType() + ", ¬рем€ отправлени€: "
				+ airline.getDepartureTime() + ", ƒни недели: " + Arrays.toString(airline.getDaysOfWeek()) + ".");
	}

	public void printAllAirlinesInfo(String message, ArrayList<Airline> airlines) {
		System.out.println(message);

		if (airlines.size() == 0) {
			System.out.println("–ейсы по заданным параметрам не найдены!");
			return;
		}

		for (int i = 0; i < airlines.size(); i++) {
			printConcreteAirlineInfo(airlines.get(i));
		}
	}

	public void printAllAirlinesInfo(String message, Airport airport) {
		System.out.println(message);

		if (airport.getAirlines().size() == 0) {
			System.out.println("–ейсы по заданным параметрам не найдены!");
			return;
		}

		for (int i = 0; i < airport.getAirlines().size(); i++) {
			printConcreteAirlineInfo(airport.getAirline(i));
		}
	}

}
