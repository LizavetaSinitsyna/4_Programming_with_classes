package by.epam.module4.part1.task3;

/*�������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������ �� ���� ���������). 
 �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� � ������� ����� ���������, ������� ������, 
 ������ ������ 9 ��� 10.*/

public class StudentTest {
	public static void main(String[] args) {
		Student[] students;

		StudentLogic logic = new StudentLogic();
		StudentViewInfo view = new StudentViewInfo();

		students = logic.generateStudents(10);

		view.printAllStudents(students);
		view.printAllExcellentStudents(students);
	}
}
