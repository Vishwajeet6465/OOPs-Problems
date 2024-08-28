package Level2;

import java.util.Scanner;

public class MethodNesting {
	
	private int length;
	private int breadth;
	private int height;
	
	public MethodNesting(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double Volume() {
		double area = Area();
		System.out.println("Area of Cuboid: "+ area);
		
		return length * breadth * height;
	}
	
	public double Area() {
		double perimeter = Perimeter();
		System.out.println("Perimeter of Cuboid: "+ perimeter);
		
		return 2 * (length * breadth + breadth * height + height * length);
	}
	
	public double Perimeter() {
		return 4 * (length + breadth + height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length of Cuboid: ");
		int l = sc.nextInt();
		
		System.out.println("Enter the Breadth of Cuboid: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Height of Cuboid: ");
		int h = sc.nextInt();
		
		MethodNesting cuboid = new MethodNesting(l, b, h);
		
		System.out.println("Volume of Cuboid is: "+ cuboid.Volume());
		sc.close();
	}

}
