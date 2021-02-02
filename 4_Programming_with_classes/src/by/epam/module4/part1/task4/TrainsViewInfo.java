package by.epam.module4.part1.task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления.*/

public class TrainsViewInfo {

	public void printConcreteTrainInfo(Train train) {

		System.out.println("Номер поезда: " + train.getNumber() + " Пункт назначения: " + train.getDestination()
				+ " Время отправления: " + train.getDepartureTime());

	}

	public void printAllAvailableTrainsInfo(String message, Train[] trains) {
		System.out.println(message);
		for (int i = 0; i < trains.length; i++) {
			printConcreteTrainInfo(trains[i]);
		}
		System.out.println();
	}

	public void printErrorMessage(String message) {
		System.out.println(message + "\n");
	}
}
