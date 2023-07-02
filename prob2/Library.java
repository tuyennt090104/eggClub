package week_3;

import java.util.Scanner;
import java.util.concurrent.Flow.Publisher;

public class Library {
	private Book[] textBook;
	private Book[] referenceBook;
	private Book[] foreignLanguageBook;
	private int countTextBook;
	private int countReferenceBook;
	private int countForeignLanguageBook;
	public Library() {
		countTextBook = countReferenceBook = countForeignLanguageBook = 0;
	}
	public void ScanTextBook(Scanner scanner) {
		System.out.print("Enter the number of textBook:");
		countTextBook = scanner.nextInt();
		textBook = new Book[countTextBook];
		for(int i = 0; i < countTextBook; ++i) {
			textBook[i] = new TextBook(scanner);
		}
	}
	public void ScanReferenceBook(Scanner scanner) {
		System.out.print("Enter the number of referenceBook:");
		countReferenceBook = scanner.nextInt();
		referenceBook = new Book[countReferenceBook];
		for(int i = 0; i < countReferenceBook; ++i) {
			referenceBook[i] = new ReferenceBook(scanner);
		}
	}
	public void ScanForeignLanguageBook(Scanner scanner) {
			System.out.print("Enter the number of foreignLanguageBook:");
			countForeignLanguageBook = scanner.nextInt();
			foreignLanguageBook = new Book[countForeignLanguageBook];
			for(int i = 0; i < countForeignLanguageBook; ++i) {
				foreignLanguageBook[i] = new ForeignLanguageBook(scanner);
			}
	}
	public void ScanBook(Scanner scanner) {
		ScanTextBook(scanner);
		ScanReferenceBook(scanner);
		ScanForeignLanguageBook(scanner);
	}
	public int CalculateBill() {
		int sum = 0;
		for(int i = 0; i < countTextBook; ++i) {
			sum += textBook[i].CalculateBill();
		}
		for(int i = 0; i < countReferenceBook; ++i) {
			sum += referenceBook[i].CalculateBill();
		}
		for(int i = 0; i < countForeignLanguageBook; ++i) {
			sum += foreignLanguageBook[i].CalculateBill();
		}
		return sum;
	}
	public void print(String publisher) {
		System.out.print("[ publisher : " + publisher + "]\n");
		for(int i = 0; i < countTextBook; ++i) {
			if(((TextBook)textBook[i]).equal(publisher)) {
				((TextBook)textBook[i]).print();
			}
		}
	}
}
