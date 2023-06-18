package mypack;

class Personnel{
	private String name;
	private int age;
	private int salary;
	private String role;
	Personnel(){
		
	}
	Personnel(String name, int age, int salary,String role){
		this.name = name;
		this.age= age;
		this.salary = salary;
		this.role = role;
	}
	public void printAge() {
		System.out.print(name + ' ' + age + ' ' + role);
	}
	public void printSalary() {
		System.out.print(name + ' ' + salary + ' ' + role);
	}
	String getRole() {
		return role;
	}
}

public class Manage {
	private Personnel[] personnel = new Personnel[100_000];
	private boolean[] isDelete = new boolean[100_000]; 
	private int size = 0;
	public void add(String name, int age, int salary, String role) {
		personnel[size++] = new Personnel(name, age, salary, role);
	}
	public void del(int id) {
		isDelete[id] = true;
	}
	void printAge() {
		for(int i = 0; i < size; ++i) {
			if(!isDelete[i]) {
				System.out.print("" + i + ' ');
				personnel[i].printAge();
				System.out.print('\n');
			}
		}
	}
	void printSalary() {
		for(int i = 0; i < size; ++i) {
			if(!isDelete[i]) {
				System.out.print("" + i + ' ');
				personnel[i].printSalary();
				System.out.print('\n');
			}
		}
	}
	void print(String role) {
		for(int i = 0; i < size; ++i) {
			if(!isDelete[i] && personnel[i].getRole() == role){
				System.out.print("" + i + ' ');
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
