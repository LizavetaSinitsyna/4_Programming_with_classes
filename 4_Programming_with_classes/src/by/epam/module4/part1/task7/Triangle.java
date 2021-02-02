package by.epam.module4.part1.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 вычисления площади, периметра и точки пересечения медиан.*/

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	private double ab;
	private double ac;
	private double bc;

	private Geometry geometry = new Geometry();
	private TriangleLogic logic = new TriangleLogic();

	public Triangle(Point a, Point b, Point c) {
		if (logic.checkValidation(a, b, c)) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.ab = geometry.getLengthBetweenTwoPoints(a, b);
			this.ac = geometry.getLengthBetweenTwoPoints(a, c);
			this.bc = geometry.getLengthBetweenTwoPoints(b, c);
		}
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		if (logic.checkValidation(a, this.b, this.c)) {
			this.a = a;
			this.ab = geometry.getLengthBetweenTwoPoints(a, this.b);
			this.ac = geometry.getLengthBetweenTwoPoints(a, this.c);
		}
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		if (logic.checkValidation(this.a, b, this.c)) {
			this.b = b;
			this.ab = geometry.getLengthBetweenTwoPoints(this.a, b);
			this.bc = geometry.getLengthBetweenTwoPoints(b, this.c);
		}
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		if (logic.checkValidation(this.a, this.b, c)) {
			this.c = c;
			this.ac = geometry.getLengthBetweenTwoPoints(a, c);
			this.bc = geometry.getLengthBetweenTwoPoints(b, c);
		}
	}

	public double getAb() {
		return ab;
	}

	public double getAc() {
		return ac;
	}

	public double getBc() {
		return bc;
	}

}
