package by.epam.module4.part1.task6;

/*6. Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой 
допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeView {

	public void showTime(Time time, String message) {
		System.out.println(message);
		System.out.println(time.getHours() + " ч. " + time.getMinutes() + " мин. " + time.getSeconds() + " сек. ");
	}

}
