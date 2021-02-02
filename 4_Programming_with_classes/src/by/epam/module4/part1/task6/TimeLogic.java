package by.epam.module4.part1.task6;

/*6. Составьте описание класса для представления времени. 
 Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
 допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeLogic {

	public boolean checkValidValueOfHours(int hours) {
		if (hours >= Time.MIN_HOURS && hours < Time.MAX_HOURS_PER_DAY) {
			return true;
		}
		System.out.println("The value for hours must be from 0 to 23! Hours are assigned a value of 0 by default.");
		return false;

	}

	public boolean checkValidValueOfMinutes(int minutes) {
		if (minutes >= Time.MIN_MINUTES && minutes < Time.MAX_MINUTES_PER_HOUR) {
			return true;
		}
		System.out.println("The value for minutes must be from 0 to 59! Minutes are assigned a value of 0 by default.");
		return false;

	}

	public boolean checkValidValueOfSeconds(int seconds) {
		if (seconds >= Time.MIN_SECONDS && seconds < Time.MAX_SECONDS_PER_MINUTE) {
			return true;
		}
		System.out.println("The value for seconds must be from 0 to 59! Seconds are assigned a value of 0 by default.");
		return false;

	}

	public Time addHours(Time time, int hours) {
		int hoursToSet;

		hours += time.getHours();

		if (hours < Time.MIN_HOURS) {
			hoursToSet = Time.MAX_HOURS_PER_DAY;
		} else {
			hoursToSet = Time.MIN_HOURS;
		}

		hoursToSet += hours % Time.MAX_HOURS_PER_DAY;

		time.setHours(hoursToSet);

		return time;
	}

	public Time addMinutes(Time time, int minutes) {
		int hours;
		int minutesToSet;

		minutes += time.getMinutes();

		hours = minutes / Time.MAX_MINUTES_PER_HOUR;

		if (minutes < Time.MIN_MINUTES) {
			hours--;
			minutesToSet = Time.MAX_MINUTES_PER_HOUR;
		} else {
			minutesToSet = Time.MIN_MINUTES;
		}

		time = addHours(time, hours);

		minutesToSet += minutes % Time.MAX_MINUTES_PER_HOUR;
		time.setMinutes(minutesToSet);

		return time;
	}

	public Time addSeconds(Time time, int seconds) {
		int minutes;
		int secondsToSet;

		seconds += time.getSeconds();

		minutes = seconds / Time.MAX_SECONDS_PER_MINUTE;

		if (seconds < Time.MIN_SECONDS) {
			minutes--;
			secondsToSet = Time.MAX_SECONDS_PER_MINUTE;
		} else {
			secondsToSet = Time.MIN_SECONDS;
		}

		time = addMinutes(time, minutes);

		secondsToSet += seconds % Time.MAX_SECONDS_PER_MINUTE;
		time.setSeconds(secondsToSet);

		return time;
	}

}
