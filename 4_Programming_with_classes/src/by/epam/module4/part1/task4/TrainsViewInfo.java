package by.epam.module4.part1.task4;

/*�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������. 
�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� 
������ ���� ����������� �� ������� �����������.*/

public class TrainsViewInfo {

	public void printConcreteTrainInfo(Train train) {

		System.out.println("����� ������: " + train.getNumber() + " ����� ����������: " + train.getDestination()
				+ " ����� �����������: " + train.getDepartureTime());

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
