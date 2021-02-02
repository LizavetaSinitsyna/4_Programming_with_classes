package by.epam.module4.part1.task7;

/*7. ������� �����, �������������� �����������. ������������� ������ ��� �������� ��������, 
���������� �������, ��������� � ����� ����������� ������.*/

public class TriangleView {
	private TriangleLogic logic = new TriangleLogic();

	public void showMainInfo(Triangle triangle, String message) {

		System.out.println(message);
		showCoordinatesInfo(triangle);
		showSidesInfo(triangle);

	}

	public void showCoordinatesInfo(Triangle triangle) {

		System.out.print("���������� ������ ������������: ");
		System.out.println("A" + triangle.getA() + " B" + triangle.getB() + " C" + triangle.getC());

	}

	public void showSidesInfo(Triangle triangle) {
		System.out.print("����� ������ ������������: ");
		System.out.println("AB = " + triangle.getAb() + " BC = " + triangle.getBc() + " AC = " + triangle.getAc());
	}

	public void showAdditionalInfo(Triangle triangle) {
		System.out.println("�������� ������������ �����: " + logic.getPerimeter(triangle));
		System.out.println("������� ������������ �����: " + logic.getArea(triangle));
		System.out.println("������� ������������ ������������ � ����� � ������������ " + logic.getMidpoint(triangle));
	}

}
