package by.epam.module4.part1.task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления.*/

public class UserViewAction {

	private TrainsLogic logic = new TrainsLogic();
	private TrainsViewInfo show = new TrainsViewInfo();
	private UserDataInput userInput = new UserDataInput();

	public void getInfoAboutConcreteTrain(Train[] trains) {
		int trainNumber;
		Train train;

		show.printAllAvailableTrainsInfo("Cписок доступных поездов: ", trains);

		trainNumber = userInput.readTrainNumber("Пожалуйста, введите номер поезда: ");
		train = logic.searchTrainByNumber(trainNumber, trains);

		if (train == null) {
			show.printErrorMessage("Поезд с таким номером не найден!");
		} else {
			show.printConcreteTrainInfo(train);
		}

	}
}
