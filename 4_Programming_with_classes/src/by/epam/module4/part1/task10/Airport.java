package by.epam.module4.part1.task10;

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
