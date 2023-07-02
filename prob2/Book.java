package week_3;

public abstract class Book {
	protected int code;
	protected String name;
	protected Date date;
	protected int cost;
	protected String publisher;
	public Book() {
		
	}
	public Book(int code, String name, Date date, int cost, String publisher) {
		this.code = code;
		this.name = name;
		this.date = date;
		this.cost = cost;
		this.publisher = publisher;
	}
	public abstract int CalculateBill();
	public void print() {
		System.out.print("" + code + ' ' + name + ' ' + date.DateToString() + ' ' + cost + ' ' + publisher + ' ');
	}
}

