package Level1;

public class Circle {
	private int radius;
	private double pi = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return pi*radius*radius;
	}
	
	public double circumference() {
		return pi*radius*2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cl = new Circle(56);
		
		System.out.println("Area of Circle is: "+cl.area());
		
		System.out.println("Circumference of Circle is: "+cl.circumference());
		
	}

}
