package by.epam.module4.part1.task4;

import java.util.Scanner;
import java.time.LocalTime;

/*�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. 
�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������. 
�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� 
������ ���� ����������� �� ������� �����������.*/

public class TrainTestPreviousVersion {
	public static void main(String[] args) {
		Train[] trains = { new Train("��c���", 138, LocalTime.of(9, 30)), new Train("��c���", 95, LocalTime.of(17, 16)),
				new Train("����", 84, LocalTime.of(20, 45)), new Train("����", 36, LocalTime.of(6, 17)),
				new Train("����������", 117, LocalTime.of(6, 17)) };

		sortTrainsByNumber(trains);

		arrayPrint("��������������� �� ������ ������ ������ �������: ", trains);

		int inputNumber = readInt("������� ����� ������:\n>>");
		printTrainInfo(inputNumber, trains);

		sortTrainsByDestination(trains);

		arrayPrint("��������������� �� ������ ���������� ������ �������: ", trains);

	}

	public static void sortTrainsByNumber(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - i - 1; j++) {
				if (trains[j].getNumber() > trains[j + 1].getNumber()) {
					swap(trains, j, j + 1);
				}
			}
		}
	}

	public static void printTrainInfo(int trainNumber, Train[] trains) {
		boolean isTrainNumberFound = false;
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumber() == trainNumber) {
				System.out.println(trains[i]);
				isTrainNumberFound = true;
			}
		}

		if (!isTrainNumberFound) {
			System.out.println("����� � ����� ������� �� ������!");
		}
		System.out.println();
	}

	public static void sortTrainsByDestination(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - i - 1; j++) {
				if (trains[j].getDestination().compareTo(trains[j + 1].getDestination()) > 0) {
					swap(trains, j, j + 1);
				}
			}
		}

		int counter = 0;
		int startIndex = 0;

		for (int i = 0; i < trains.length - 1; i++) {

			if (trains[i].getDestination().compareTo(trains[i + 1].getDestination()) == 0) {
				counter++;
			} else {
				if (counter > 0) {
					sortTrainsByDepartureTime(trains, startIndex, startIndex + counter);
					counter = 0;
				}
				startIndex = i + 1;
			}
		}

		if (counter > 0) {
			sortTrainsByDepartureTime(trains, startIndex, startIndex + counter);
		}

	}

	public static void sortTrainsByDepartureTime(Train[] trains, int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			for (int j = startIndex; j < endIndex - (i - startIndex); j++) {
				if (trains[j].getDepartureTime().compareTo(trains[j + 1].getDepartureTime()) > 0) {
					swap(trains, j, j + 1);
				}
			}
		}

	}

	public static void swap(Train[] trains, int index1, int index2) {
		Train temp = trains[index1];
		trains[index1] = trains[index2];
		trains[index2] = temp;
	}

	public static void arrayPrint(String message, Train[] trains) {
		System.out.println(message);
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i]);
		}
		System.out.println();
	}

	public static int readInt(String message) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number;
		do {
			System.out.println(message);

			while (!scan.hasNextInt()) {
				scan.nextLine();
				System.out.println(message);
			}

			number = scan.nextInt();
			scan.nextLine();
		} while (number < 1);

		return number;
	}
}
