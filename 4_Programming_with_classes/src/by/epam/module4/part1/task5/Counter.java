package by.epam.module4.part1.task5;

/*5. ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� �������� �� ������� 
 � �������� ���������. ������������� ������������� �������� ���������� �� ��������� � ������������� ����������. 
 ������� ����� ������ ���������� � ���������� ���������, � ����� ����������� �������� ��� ������� ���������. 
 �������� ���, ��������������� ��� ����������� ������.*/

public class Counter {
	private int currentState;
	private int lowerBound;
	private int upperBound;

	public Counter() {
		currentState = 1;
		lowerBound = 0;
		upperBound = 10;
	}

	public Counter(int currentState, int lowerBound, int upperBound) {
		if (checkValidBoundsValue(lowerBound, upperBound)) {
			this.lowerBound = lowerBound;
			this.upperBound = upperBound;
		} else {
			this.lowerBound = upperBound;
			this.upperBound = lowerBound;
		}

		if (checkValidCurrentStateValue(currentState, lowerBound, upperBound)) {
			this.currentState = currentState;
		} else {
			this.currentState = this.lowerBound;
		}

	}

	public int getCurrentState() {
		return currentState;
	}

	/*
	 * public void setCurrentState(int currentState) { this.currentState =
	 * currentState; }
	 * 
	 * public int getLowerBound() { return lowerBound; }
	 * 
	 * public void setLowerBound(int lowerBound) { this.lowerBound = lowerBound; }
	 * 
	 * public int getUpperBound() { return upperBound; }
	 * 
	 * public void setUpperBound(int upperBound) { this.upperBound = upperBound; }
	 */

	public void increase() {
		if (currentState < upperBound) {
			currentState++;
		} else {
			System.out.println("������� �������� �������� ����� ������� �������, ���������� ��������� ����������.");
		}
	}

	public void decrease() {
		if (currentState > lowerBound) {
			currentState--;
		} else {
			System.out.println("������� �������� �������� ����� ������ �������, ���������� ��������� ����������.");
		}
	}

	private boolean checkValidCurrentStateValue(int currentState, int lowerBound, int upperBound) {
		if (currentState >= lowerBound && currentState <= upperBound) {
			return true;
		} else {
			System.out.println("��������� ������� �������� �� ������ � �������� ��������. "
					+ "�������� �� ��������� ��������� ��������, ������ ������ �������.");
			return false;
		}
	}

	private boolean checkValidBoundsValue(int lowerBound, int upperBound) {
		if (lowerBound < upperBound) {
			return true;
		} else {
			System.out.println("������ ������� ������ �������! �������� ������� � ������ ������ �������� ���� ������.");
			return false;
		}
	}

}
