package by.epam.module4.part1.task10;

import java.time.LocalTime;
import java.util.Arrays;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Airline {
	private String destinationPoint;
	private int flightNumber;
	private String flightType;
	private LocalTime departureTime;
	private String[] daysOfWeek;

	public Airline(String destinationPoint, int flightNumber, String flightType, LocalTime departureTime,
			String[] daysOfWeek) {
		this.destinationPoint = destinationPoint;
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destinationPoint=" + destinationPoint + ", flightNumber=" + flightNumber + ", flightType="
				+ flightType + ", departureTime=" + departureTime + ", daysOfWeek=" + Arrays.toString(daysOfWeek) + "]";
	}

}
