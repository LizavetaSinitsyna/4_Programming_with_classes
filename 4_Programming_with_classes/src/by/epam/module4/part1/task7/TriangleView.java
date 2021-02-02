package by.epam.module4.part1.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleView {
	private TriangleLogic logic = new TriangleLogic();

	public void showMainInfo(Triangle triangle, String message) {

		System.out.println(message);
		showCoordinatesInfo(triangle);
		showSidesInfo(triangle);

	}

	public void showCoordinatesInfo(Triangle triangle) {

		System.out.print("Координаты вершин треугольника: ");
		System.out.println("A" + triangle.getA() + " B" + triangle.getB() + " C" + triangle.getC());

	}

	public void showSidesInfo(Triangle triangle) {
		System.out.print("Длины сторон треугольника: ");
		System.out.println("AB = " + triangle.getAb() + " BC = " + triangle.getBc() + " AC = " + triangle.getAc());
	}

	public void showAdditionalInfo(Triangle triangle) {
		System.out.println("Периметр треугольника равен: " + logic.getPerimeter(triangle));
		System.out.println("Площадь треугольника равна: " + logic.getArea(triangle));
		System.out.println("Медианы треугольника пересекаются в точке с координатами " + logic.getMidpoint(triangle));
	}

}
