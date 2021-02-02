package by.epam.module4.part1.task5;

/*5. ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� �������� �� ������� 
 � �������� ���������. ������������� ������������� �������� ���������� �� ��������� � ������������� ����������. 
 ������� ����� ������ ���������� � ���������� ���������, � ����� ����������� �������� ��� ������� ���������. 
 �������� ���, ��������������� ��� ����������� ������.*/

public class CounterTest {
	public static void main(String[] args) {
		Counter counter1 = new Counter();
		printCurrentState(counter1.getCurrentState());
		counter1.decrease();
		counter1.decrease();
		printCurrentState(counter1.getCurrentState());

		Counter counter2 = new Counter(-10, 5, 8);
		counter2.increase();
		printCurrentState(counter2.getCurrentState());

		Counter counter3 = new Counter(9, 10, 5);
		counter3.increase();
		printCurrentState(counter3.getCurrentState());
	}

	public static void printCurrentState(int state) {
		System.out.println("������� ��������� �������� " + state);
	}
}
