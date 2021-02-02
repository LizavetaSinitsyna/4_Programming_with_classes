package by.epam.module4.part1.task3;

import java.util.Random;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
 равные только 9 или 10.*/

public class StudentLogic {

	public Student[] generateStudents(int studentsNumber) {
		Student[] students = new Student[studentsNumber];
		for (int i = 0; i < students.length; i++) {
			int[] grades = new int[5];
			for (int j = 0; j < grades.length; j++) {
				grades[j] = new Random().nextInt(10) + 1;
			}
			students[i] = new Student("Student" + (i + 1), i + 1, grades);
		}
		return students;
	}

}
