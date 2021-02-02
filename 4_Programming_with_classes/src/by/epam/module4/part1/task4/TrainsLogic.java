package by.epam.module4.part1.task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления.*/

public class TrainsLogic {

	public Train searchTrainByNumber(int trainNumber, Train[] trains) {

		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumber() == trainNumber) {
				return trains[i];
			}
		}

		return null;
	}

	public void sortTrainsByNumber(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - i - 1; j++) {
				if (trains[j].getNumber() > trains[j + 1].getNumber()) {
					swap(trains, j, j + 1);
				}
			}
		}
	}

	public void sortTrainsByDestination(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - i - 1; j++) {
				if (trains[j].getDestination().compareTo(trains[j + 1].getDestination()) > 0) {
					swap(trains, j, j + 1);
				}
			}
		}

		int counter = 0;

		for (int i = 0; i < trains.length - 1; i++) {

			if (trains[i].getDestination().compareTo(trains[i + 1].getDestination()) == 0) {
				counter++;
			} else {
				if (counter > 0) {
					sortTrainsByDepartureTime(trains, i - counter, i);
				}
				counter = 0;
			}
		}

		if (counter > 0) {
			sortTrainsByDepartureTime(trains, trains.length - 1 - counter, trains.length - 1);
		}

	}

	public void sortTrainsByDepartureTime(Train[] trains, int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			for (int j = startIndex; j < endIndex - (i - startIndex); j++) {
				if (trains[j].getDepartureTime().compareTo(trains[j + 1].getDepartureTime()) > 0) {
					swap(trains, j, j + 1);
				}
			}
		}

	}

	public void swap(Train[] trains, int index1, int index2) {
		Train temp = trains[index1];
		trains[index1] = trains[index2];
		trains[index2] = temp;
	}

}
