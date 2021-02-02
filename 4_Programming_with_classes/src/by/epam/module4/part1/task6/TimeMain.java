package by.epam.module4.part1.task6;

/*6. Составьте описание класса для представления времени. 
 Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
 допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeMain {

	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		int hoursToAdd;
		int minutesToAdd;
		int secondsToAdd;
		Time time;

		TimeLogic logic = new TimeLogic();
		UserDataInput input = new UserDataInput();
		TimeView view = new TimeView();

		hours = input.requestValue("Введите количество часов\n>>");
		minutes = input.requestValue("Введите количество минут\n>>");
		seconds = input.requestValue("Введите количество секунд\n>>");

		time = new Time(hours, minutes, seconds);
		view.showTime(time, "Установлено время:");

		hours = input.requestValue("Введите количество часов\n>>");
		time.setHours(hours);
		view.showTime(time, "Установлено время:");

		minutes = input.requestValue("Введите количество минут\n>>");
		time.setMinutes(minutes);
		view.showTime(time, "Установлено время:");

		seconds = input.requestValue("Введите количество секунд\n>>");
		time.setSeconds(seconds);
		view.showTime(time, "Установлено время:");

		// change only hours
		hoursToAdd = input.requestValue("Введите количество часов, на которое следует изменить время\n>>");
		logic.addHours(time, hoursToAdd);
		view.showTime(time, "Время после изменения часов:");

		// change only minutes
		minutesToAdd = input.requestValue("Введите количество минут, на которое следует изменить время\n>>");
		logic.addMinutes(time, minutesToAdd);
		view.showTime(time, "Время после изменения минут:");

		// change only seconds
		secondsToAdd = input.requestValue("Введите количество секунд, на которое следует изменить время\n>>");
		logic.addSeconds(time, secondsToAdd);
		view.showTime(time, "Время после изменения секунд:");

	}

}
