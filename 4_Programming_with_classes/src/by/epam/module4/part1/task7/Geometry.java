package by.epam.module4.part1.task7;

/*7. ������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, 
���������� �������, ��������� � ����� ����������� ������.*/

public class Geometry {
	public double getLengthBetweenTwoPoints(Point point1, Point point2) {
		double length;

		length = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));

		return length;
	}
}
