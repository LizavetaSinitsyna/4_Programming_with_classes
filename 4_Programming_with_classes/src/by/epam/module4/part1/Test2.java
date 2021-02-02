package by.epam.module4.part1;

/*Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, 
 инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/

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
