package by.epam.module4.part1.task6;

/*6. ��������� �������� ������ ��� ������������� �������. 
������������ ����������� ��������� ������� � ��������� ��� ��������� ����� (���, ������, �������) � ��������� 
������������ �������� ��������. � ������ ������������ �������� ����� ���� ��������������� � �������� 0. 
������� ������ ��������� ������� �� �������� ���������� �����, ����� � ������.*/

public class TimeView {

	public void showTime(Time time, String message) {
		System.out.println(message);
		System.out.println(time.getHours() + " �. " + time.getMinutes() + " ���. " + time.getSeconds() + " ���. ");
	}

}
