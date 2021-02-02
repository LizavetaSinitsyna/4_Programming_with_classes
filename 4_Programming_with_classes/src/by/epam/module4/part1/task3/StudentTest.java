package by.epam.module4.part1.task3;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
 Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, 
 равные только 9 или 10.*/

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
