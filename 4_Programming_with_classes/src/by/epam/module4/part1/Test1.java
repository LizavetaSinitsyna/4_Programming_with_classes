package by.epam.module4.part1;

/*1. �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� ����������. 
 �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� ������� ���������� �������� �� ���� ���� ����������.*/

public class Test1 {
	private double a;
	private double b;

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

	public double getsum() {
		return a + b;
	}

	public double getMax() {
		return a > b ? a : b;
	}

	public void print() {
		System.out.print("a = " + a + " b = " + b);
	}

}
