// Finding area of circle square rectangle by method overloading
package Level2;

import java.util.Scanner;

public class Area {
	
	public double Square(double a){
		return Math.pow(a, 2);
	}
	
	public double Rectangle(double a, double b){
		return a * b;
	}
	
	public double Circle(double r){
		double pi = 3.14;
		return pi * Math.pow(r, 2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Finding area of Square, Rectangle and Circle");
		System.out.println("Enter side of square: ");
		double s = sc.nextDouble();
		
		System.out.println("Enter length of rectangle: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter breadth of rectangle: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter radius of circle: ");
		double r = sc.nextDouble();
		
		Area ar = new Area();

		System.out.println("Area of Square: "+ ar.Square(s));
		System.out.println("Area of Rectangle: "+ ar.Rectangle(a,b));
		System.out.println("Area of Circle: "+ String.format("%.2f", ar.Circle(r)));
		
		sc.close();
	}

}