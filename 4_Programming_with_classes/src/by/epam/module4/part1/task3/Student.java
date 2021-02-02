package by.epam.module4.part1.task3;

import java.util.Arrays;

/*�������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������ �� ���� ���������). 
 �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� � ������� ����� ���������, ������� ������, 
 ������ ������ 9 ��� 10.*/

public class Student {
	private String name;
	private int groupNumber;
	private static final int GRADES_NUMBER = 5;
	private int[] grades = new int[GRADES_NUMBER];

	public Student(String name, int groupNumber, int[] grades) {
		this.name = name;
		this.groupNumber = groupNumber;
		if (checkValidValue(grades)) {
			this.grades = grades;
		}
	}

	public Student(String name, int groupNumber) {
		this.name = name;
		this.groupNumber = groupNumber;
	}

	public Student(String name, int[] grades) {
		this.name = name;
		this.grades = grades;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		if (checkValidValue(grades)) {
			this.grades = grades;
		}
	}

	public boolean isExcellentStudent() {

		for (int grade : grades) {
			if (grade < 9) {
				return false;
			}
		}

		return true;
	}

	private boolean checkValidValue(int[] grades) {
		if (grades.length != 5) {
			System.out.println("���������� ������ ������ ���� ����� 5!");
			return false;
		}
		return true;
	}

	@Override

	public String toString() {
		return "���: " + name + " ����� ������: " + groupNumber + " ������: " + Arrays.toString(grades);
	}

}
