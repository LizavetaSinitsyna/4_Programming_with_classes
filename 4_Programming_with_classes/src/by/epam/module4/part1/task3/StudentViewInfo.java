package by.epam.module4.part1.task3;

import java.util.Arrays;

/*�������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������ �� ���� ���������). 
 �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� � ������� ����� ���������, ������� ������, 
 ������ ������ 9 ��� 10.*/

public class StudentViewInfo {

	public void printAllStudents(Student[] students) {
		System.out.println("������ ���������:");
		for (int i = 0; i < students.length; i++) {
			printConcreteStudentInfo(students[i]);
		}
	}

	public void printConcreteStudentInfo(Student student) {
		System.out.println("���: " + student.getName() + " ����� ������: " + student.getGroupNumber() + " ������: "
				+ Arrays.toString(student.getGrades()));

	}

	public void printAllExcellentStudents(Student[] students) {
		System.out.println("C����� ���������-����������: ");
		for (Student student : students) {
			if (student.isExcellentStudent()) {
				System.out.println("�������: " + student.getName() + " ����� ������: " + student.getGroupNumber());
			}
		}
	}
}
