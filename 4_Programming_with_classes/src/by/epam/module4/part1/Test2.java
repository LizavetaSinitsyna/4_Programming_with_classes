package by.epam.module4.part1;

/*�������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. �������� �����������, 
 ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ���������� ������.*/

public class Test2 {
	private double a;
	private double b;

	public Test2() {
		a = 0;
		b = 0;
	}

	public Test2(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
