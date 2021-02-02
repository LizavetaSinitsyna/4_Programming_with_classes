package by.epam.module4.part1.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан.*/

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		return "{" + x + ", " + y + "}";
	}

}
