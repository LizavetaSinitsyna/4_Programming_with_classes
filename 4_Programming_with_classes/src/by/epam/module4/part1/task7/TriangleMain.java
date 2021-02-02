package by.epam.module4.part1.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleMain {

	public static void main(String[] args) {
		Point a = new Point();
		Point b = new Point();
		Point c = new Point();
		Triangle triangle;

		UserDataInput input = new UserDataInput();
		TriangleView view = new TriangleView();
		TriangleLogic logic = new TriangleLogic();

		do {
			a = input.requestCoordinates("Введите координаты точки А: ");
			b = input.requestCoordinates("Введите координаты точки B: ");
			c = input.requestCoordinates("Введите координаты точки C: ");
		} while (!logic.checkValidation(a, b, c));

		triangle = new Triangle(a, b, c);

		view.showMainInfo(triangle, "Сформирован треугольник со следующими параметрами:");

		a = input.requestCoordinates("Введите новые координаты точки А: ");
		triangle.setA(a);
		view.showMainInfo(triangle, "Сформирован треугольник со следующими параметрами:");

		b = input.requestCoordinates("Введите новые координаты точки B: ");
		triangle.setB(b);
		view.showMainInfo(triangle, "Сформирован треугольник со следующими параметрами:");

		c = input.requestCoordinates("Введите новые координаты точки C: ");
		triangle.setC(c);
		view.showMainInfo(triangle, "Сформирован треугольник со следующими параметрами:");

		view.showAdditionalInfo(triangle);

	}

}
