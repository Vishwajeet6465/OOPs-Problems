package Level2;

import java.util.Scanner;

class Triangle{
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double TriArea() {
		double area = (base*height)/2;
		
		return area;
	}
}

class Rectangle{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double RectArea() {
		double area = length * breadth;
		return area;
	}
}

public class RectTri {
	
	public static double getRectArea(Rectangle rect) {
		return rect.RectArea();
	}
	
	public static double getTriArea(Triangle tri) {
		return tri.TriArea();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Base of Triangle: ");
		int b = scanner.nextInt();

		System.out.println("Enter the Height of Triangle: ");
		int h = scanner.nextInt();

		System.out.println("Enter the Length of Rectangle: ");
		int a = scanner.nextInt();

		System.out.println("Enter the Breadth of Rectangle: ");
		int bd = scanner.nextInt();
		
		Triangle tri = new Triangle(b,h);
		Rectangle rect = new Rectangle(a,bd);
		
		System.out.println("Area of Rectangle: "+ getRectArea(rect));
		System.out.println("Area of Triangle: "+ getTriArea(tri));
		
		scanner.close();
	}

}
