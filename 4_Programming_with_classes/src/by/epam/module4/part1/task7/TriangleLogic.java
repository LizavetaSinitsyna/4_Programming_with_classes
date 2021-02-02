package by.epam.module4.part1.task7;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 вычисления площади, периметра и точки пересечения медиан.*/

public class TriangleLogic {

	private Geometry geometry = new Geometry();

	public boolean checkValidation(Point point1, Point point2, Point point3) {
		double sidePoint1Point2;
		double sidePoint2Point3;
		double sidePoint1Point3;

		sidePoint1Point2 = geometry.getLengthBetweenTwoPoints(point1, point2);
		sidePoint2Point3 = geometry.getLengthBetweenTwoPoints(point2, point3);
		sidePoint1Point3 = geometry.getLengthBetweenTwoPoints(point1, point3);

		if (sidePoint1Point2 + sidePoint1Point3 > sidePoint2Point3
				&& sidePoint1Point2 + sidePoint2Point3 > sidePoint1Point3
				&& sidePoint1Point3 + sidePoint2Point3 > sidePoint1Point2) {
			return true;
		} else {
			System.out.println("Triangle with such parametres doesn't exist!");
		}

		return false;
	}

	public double getPerimeter(Triangle triangle) {
		double perimeter;

		perimeter = triangle.getAb() + triangle.getAc() + triangle.getBc();

		return perimeter;
	}

	public double getArea(Triangle triangle) {
		double semiperimeter;
		double area;

		semiperimeter = getPerimeter(triangle) / 2;
		area = Math.sqrt(semiperimeter * (semiperimeter - triangle.getAb()) * (semiperimeter - triangle.getAc())
				* (semiperimeter - triangle.getBc()));

		return area;
	}

	public Point getMidpoint(Triangle triangle) {
		Point midpoint;
		double x;
		double y;

		x = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3;
		y = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3;

		midpoint = new Point(x, y);

		return midpoint;
	}

}
