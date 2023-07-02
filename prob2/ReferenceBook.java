package week_3;

import java.util.Scanner;

public class ReferenceBook extends Book{
	private String field;
	private int tax;
	public ReferenceBook(int code, String name, Date date, int cost, String publisher, String field, int tax) {
		super(code, name, date, cost, publisher);
		this.field = field;
		this.tax = tax;
	}
	public ReferenceBook(Scanner scanner) {
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
		System.out.print("Enter status field:");
		field = scanner.next();
		System.out.print("Enter status tax:");
		tax = scanner.nextInt();
	}
	public int CalculateBill() {
		return super.cost + tax;
	}
	public void print() {
		super.print();
		System.out.print(field + ' ' + tax + "\n");
	}
}
