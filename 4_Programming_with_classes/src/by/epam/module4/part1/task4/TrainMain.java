package by.epam.module4.part1.task4;

import java.time.LocalTime;

/*�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������. 
�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� 
������ ���� ����������� �� ������� �����������.*/

public class TrainMain {
	public static void main(String[] args) {
		Train[] trains = { new Train("��c���", 138, LocalTime.of(9, 30)), new Train("��c���", 95, LocalTime.of(17, 16)),
				new Train("����", 84, LocalTime.of(20, 45)), new Train("����", 36, LocalTime.of(6, 17)),
				new Train("����������", 117, LocalTime.of(6, 17)) };

		TrainsLogic logic = new TrainsLogic();
		TrainsViewInfo show = new TrainsViewInfo();
		UserViewAction userViewConcreteTrainInfo = new UserViewAction();
		
		show.printAllAvailableTrainsInfo("�������� ������ �������: ", trains);

		logic.sortTrainsByNumber(trains);
		show.printAllAvailableTrainsInfo("��������������� �� ������ ������ ������ �������: ", trains);

		userViewConcreteTrainInfo.getInfoAboutConcreteTrain(trains);

		logic.sortTrainsByDestination(trains);
		show.printAllAvailableTrainsInfo("\n��������������� �� ������ ���������� ������ �������: ", trains);

	}
}
