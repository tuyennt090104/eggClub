package week_3;

import java.util.Scanner;

public class ForeignLanguageBook extends Book{
	private String language;
	public ForeignLanguageBook(int code, String name, Date date, int cost, String publisher, String language) {
		super(code, name, date, cost, publisher);
		this.language = language;
	}
	public ForeignLanguageBook(Scanner scanner) {
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
		System.out.print("Enter language:");
		language = scanner.next();
	}
	public int CalculateBill() {
		return super.cost * 6 / 5;
	}
	public void print() {
		super.print();
		System.out.print(language + "\n");
	}
}
