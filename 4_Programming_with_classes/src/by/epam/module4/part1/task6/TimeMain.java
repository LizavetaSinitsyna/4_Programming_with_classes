package by.epam.module4.part1.task6;

/*6. ��������� �������� ������ ��� ������������� �������. 
 ������������ ����������� ��������� ������� � ��������� ��� ��������� ����� (���, ������, �������) � ��������� 
 ������������ �������� ��������. � ������ ������������ �������� ����� ���� ��������������� � �������� 0. 
 ������� ������ ��������� ������� �� �������� ���������� �����, ����� � ������.*/

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

		hours = input.requestValue("������� ���������� �����\n>>");
		minutes = input.requestValue("������� ���������� �����\n>>");
		seconds = input.requestValue("������� ���������� ������\n>>");

		time = new Time(hours, minutes, seconds);
		view.showTime(time, "����������� �����:");

		hours = input.requestValue("������� ���������� �����\n>>");
		time.setHours(hours);
		view.showTime(time, "����������� �����:");

		minutes = input.requestValue("������� ���������� �����\n>>");
		time.setMinutes(minutes);
		view.showTime(time, "����������� �����:");

		seconds = input.requestValue("������� ���������� ������\n>>");
		time.setSeconds(seconds);
		view.showTime(time, "����������� �����:");

		// change only hours
		hoursToAdd = input.requestValue("������� ���������� �����, �� ������� ������� �������� �����\n>>");
		logic.addHours(time, hoursToAdd);
		view.showTime(time, "����� ����� ��������� �����:");

		// change only minutes
		minutesToAdd = input.requestValue("������� ���������� �����, �� ������� ������� �������� �����\n>>");
		logic.addMinutes(time, minutesToAdd);
		view.showTime(time, "����� ����� ��������� �����:");

		// change only seconds
		secondsToAdd = input.requestValue("������� ���������� ������, �� ������� ������� �������� �����\n>>");
		logic.addSeconds(time, secondsToAdd);
		view.showTime(time, "����� ����� ��������� ������:");

	}

}
