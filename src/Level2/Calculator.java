package Level2;
import java.util.Scanner;

public class Calculator {
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		return new int[] {num1,num2};
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = input();
		
		int num1 = numbers[0];
		int num2 = numbers[1];
		
		int result = num1 + num2;
		System.out.println("Addition of two numbers is: "+ result);
	}

}
