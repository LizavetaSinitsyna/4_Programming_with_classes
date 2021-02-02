package by.epam.module4.part1;

/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.*/

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
