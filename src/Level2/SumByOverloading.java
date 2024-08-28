// In this program we are finding the arithmetic sum of parameters by method overriding 

package Level2;

import java.util.Scanner;

public class SumByOverloading {
	
	public double TwoSum(double a, double b){
		return a + b;
	}
	
	public double ThreeSum(double a, double b, double c){
		return a + b + c;
	}
	
	public double FourSum(double a, double b,double c, double d){
		return a + b + c + d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Enter the third number: ");
		double n3 = sc.nextDouble();
		
		System.out.println("Enter the fourth number: ");
		double n4 = sc.nextDouble();
		
		SumByOverloading sm = new SumByOverloading();

		System.out.println("Sum of first two numbers: "+ sm.TwoSum(n1,n2));
		System.out.println("Sum of first two numbers: "+ sm.ThreeSum(n1,n2,n3));
		System.out.println("Sum of first two numbers: "+ sm.FourSum(n1,n2,n3,n4));
		
		sc.close();

	}

}
