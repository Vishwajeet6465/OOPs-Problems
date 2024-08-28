package Level3;

import java.util.Scanner;

//Shape interface
interface Shape {
 void input();
 double area();
}

//Circle class implementing Shape interface
class Circle implements Shape {
 private double radius;

 public void input() {
     System.out.print("Enter radius of circle: ");
     Scanner scanner = new Scanner(System.in);
     radius = scanner.nextDouble();
 }

 public double area() {
     return Math.PI * radius * radius;
 }
}

//Rectangle class implementing Shape interface
class Rectangle implements Shape {
 private double length;
 private double width;

 public void input() {
     System.out.print("Enter length of rectangle: ");
     Scanner scanner = new Scanner(System.in);
     length = scanner.nextDouble();
     System.out.print("Enter width of rectangle: ");
     width = scanner.nextDouble();
 }

 public double area() {
     return length * width;
 }
}

public class ShapeInterface {
 public static void main(String[] args) {
     Shape circle = new Circle();
     Shape rectangle = new Rectangle();

     System.out.println("Circle:");
     circle.input();
     System.out.println("Area of circle: " + circle.area());

     System.out.println("\nRectangle:");
     rectangle.input();
     System.out.println("Area of rectangle: " + rectangle.area());
 }
}