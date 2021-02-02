package by.epam.module4.part1.task3;

import java.util.Arrays;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
 равные только 9 или 10.*/

public class StudentViewInfo {

	public void printAllStudents(Student[] students) {
		System.out.println("Список студентов:");
		for (int i = 0; i < students.length; i++) {
			printConcreteStudentInfo(students[i]);
		}
	}

	public void printConcreteStudentInfo(Student student) {
		System.out.println("ФИО: " + student.getName() + " Номер группы: " + student.getGroupNumber() + " Оценки: "
				+ Arrays.toString(student.getGrades()));

	}

	public void printAllExcellentStudents(Student[] students) {
		System.out.println("Cписок студентов-отличников: ");
		for (Student student : students) {
			if (student.isExcellentStudent()) {
				System.out.println("Фамилия: " + student.getName() + " Номер группы: " + student.getGroupNumber());
			}
		}
	}
}
