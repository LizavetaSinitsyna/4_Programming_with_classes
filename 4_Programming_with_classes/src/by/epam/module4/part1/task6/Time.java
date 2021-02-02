package by.epam.module4.part1.task6;

/*6. Составьте описание класса для представления времени. 
 Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
 допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public static final int MAX_HOURS_PER_DAY = 24;

	public static final int MAX_MINUTES_PER_HOUR = 60;

	public static final int MAX_SECONDS_PER_MINUTE = 60;

	public static final int MIN_HOURS = 0;

	public static final int MIN_MINUTES = 0;

	public static final int MIN_SECONDS = 0;

	private TimeLogic logic = new TimeLogic();

	public Time(int hours, int minutes, int seconds) {

		if (logic.checkValidValueOfHours(hours)) {
			this.hours = hours;
		} else {
			this.hours = MIN_HOURS;
		}

		if (logic.checkValidValueOfMinutes(minutes)) {
			this.minutes = minutes;
		} else {
			this.minutes = MIN_MINUTES;
		}

		if (logic.checkValidValueOfSeconds(seconds)) {
			this.seconds = seconds;
		} else {
			this.seconds = MIN_SECONDS;
		}

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (logic.checkValidValueOfHours(hours)) {
			this.hours = hours;
		} else {
			this.hours = MIN_HOURS;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (logic.checkValidValueOfMinutes(minutes)) {
			this.minutes = minutes;
		} else {
			this.minutes = MIN_MINUTES;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (logic.checkValidValueOfSeconds(seconds)) {
			this.seconds = seconds;
		} else {
			this.seconds = MIN_SECONDS;
		}
	}

}
