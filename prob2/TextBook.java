package week_3;

import java.util.Scanner;

public class TextBook extends Book {
	private boolean status;
	public TextBook(int code, String name, Date date, int cost, String publisher, boolean status) {
			super(code, name, date, cost, publisher);
			this.status = status;
	}
	public TextBook(Scanner scanner) {
		System.out.print("Enter code:");
		code = scanner.nextInt();
		System.out.print("Enter name:");
		name = scanner.next();
		System.out.print("Enter date:");
		date = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.print("Enter cost:");
		cost = scanner.nextInt();
		System.out.print("Enter publisher:");
		publisher = scanner.next();
		System.out.print("Enter status new or old:");
		status = scanner.nextBoolean();
	}
	public boolean equal(String publisher) {
		return this.publisher.hashCode() == publisher.hashCode();
	}
	public int CalculateBill() {
		return status ? super.cost : super.cost / 2;
	}
	public void print() {
		super.print();
		System.out.print(status + "\n");
	}
}
