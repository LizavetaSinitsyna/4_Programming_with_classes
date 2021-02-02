package by.epam.module4.part1.task4;

/*�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������. 
�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� 
������ ���� ����������� �� ������� �����������.*/

public class UserViewAction {

	private TrainsLogic logic = new TrainsLogic();
	private TrainsViewInfo show = new TrainsViewInfo();
	private UserDataInput userInput = new UserDataInput();

	public void getInfoAboutConcreteTrain(Train[] trains) {
		int trainNumber;
		Train train;

		show.printAllAvailableTrainsInfo("C����� ��������� �������: ", trains);

		trainNumber = userInput.readTrainNumber("����������, ������� ����� ������: ");
		train = logic.searchTrainByNumber(trainNumber, trains);

		if (train == null) {
			show.printErrorMessage("����� � ����� ������� �� ������!");
		} else {
			show.printConcreteTrainInfo(train);
		}

	}
}
