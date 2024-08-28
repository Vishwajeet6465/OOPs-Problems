package Level3;

import java.util.Scanner;

public class ParameterisedMethods {
    static double length, breadth, height;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of cuboid: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        breadth = scanner.nextDouble();
        System.out.print("Enter height of cuboid: ");
        height = scanner.nextDouble();
    }

    static double calculateVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        input();
        double volume = calculateVolume();
        System.out.println("Volume of cuboid: " + volume);
    }
}