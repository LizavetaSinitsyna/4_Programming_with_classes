package by.epam.module4.part1.task7;

/*7. ������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, 
���������� �������, ��������� � ����� ����������� ������.*/

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
			a = input.requestCoordinates("������� ���������� ����� �: ");
			b = input.requestCoordinates("������� ���������� ����� B: ");
			c = input.requestCoordinates("������� ���������� ����� C: ");
		} while (!logic.checkValidation(a, b, c));

		triangle = new Triangle(a, b, c);

		view.showMainInfo(triangle, "����������� ����������� �� ���������� �����������:");

		a = input.requestCoordinates("������� ����� ���������� ����� �: ");
		triangle.setA(a);
		view.showMainInfo(triangle, "����������� ����������� �� ���������� �����������:");

		b = input.requestCoordinates("������� ����� ���������� ����� B: ");
		triangle.setB(b);
		view.showMainInfo(triangle, "����������� ����������� �� ���������� �����������:");

		c = input.requestCoordinates("������� ����� ���������� ����� C: ");
		triangle.setC(c);
		view.showMainInfo(triangle, "����������� ����������� �� ���������� �����������:");

		view.showAdditionalInfo(triangle);

	}

}
