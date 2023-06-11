package mypack;

public class rectangle {
	String name = "ABCD";
	double x = 2.5, y = 3.5;
	public  void printName() {
		System.out.println(name);
		return ;
	}
	double perimeter() {
		return (x + y) * 2;
	}
	double area() {
		return x * y;
	}
	public static void main(String[] args) {
		rectangle myRec = new rectangle();
		myRec.printName();
		System.out.println(myRec.perimeter());
		System.out.println(myRec.area());
	}

}
