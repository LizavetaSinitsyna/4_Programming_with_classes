package by.epam.module4.part1.task9;

/*9. ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � ����� toString(). 
������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
����� � �������:
a) ������ ���� ��������� ������;
b) ������ ����, ���������� �������� �������������;
c) ������ ����, ���������� ����� ��������� ����. 
 */

public class Book {
	private long id;
	private String name;
	private String[] authors;
	private String publisher;
	private int yearOfPublishing;
	private int pages;
	private double price;
	private String bindingType;

	public Book(long id, String name, String[] authors, String publisher, int yearOfPublishing, int pages, double price, String bindingType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
	@Override
	public String toString() {
		return "Book: id = " + id + ", name = " + name + ", authors = " + authors + ", publisher = " 
				+ publisher + ", yearOfPublishing = " + yearOfPublishing + ", pages = " + pages + ", price = " 
				+ price + ", bindingType = " + bindingType + ".";
	}
	


}
