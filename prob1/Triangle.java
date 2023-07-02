package week_3;

public class Triangle extends Shape{
	private float a, b, c; 
	public Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float Perimeter() {
		return a + b + c;
	}
	public float Area() {
		float p = Perimeter() / 2;
		return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
