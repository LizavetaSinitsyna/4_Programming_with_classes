package by.epam.module4.part1.task4;

import java.time.LocalTime;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления.*/

public class TrainMain {
	public static void main(String[] args) {
		Train[] trains = { new Train("Моcква", 138, LocalTime.of(9, 30)), new Train("Моcква", 95, LocalTime.of(17, 16)),
				new Train("Киев", 84, LocalTime.of(20, 45)), new Train("Киев", 36, LocalTime.of(6, 17)),
				new Train("Барановичи", 117, LocalTime.of(6, 17)) };

		TrainsLogic logic = new TrainsLogic();
		TrainsViewInfo show = new TrainsViewInfo();
		UserViewAction userViewConcreteTrainInfo = new UserViewAction();
		
		show.printAllAvailableTrainsInfo("Исходный список поездов: ", trains);

		logic.sortTrainsByNumber(trains);
		show.printAllAvailableTrainsInfo("Отсортированный по номеру поезда список поездов: ", trains);

		userViewConcreteTrainInfo.getInfoAboutConcreteTrain(trains);

		logic.sortTrainsByDestination(trains);
		show.printAllAvailableTrainsInfo("\nОтсортированный по пункту назначения список поездов: ", trains);

	}
}
