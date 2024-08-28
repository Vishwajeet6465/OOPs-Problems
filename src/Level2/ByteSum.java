package Level2;

import java.util.Scanner;

public class ByteSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first byte value: ");
        byte byte1 = scanner.nextByte();

        System.out.print("Enter second byte value: ");
        byte byte2 = scanner.nextByte();

        int sum = sumBytes(byte1, byte2);

        System.out.println("Sum of two byte values: " + sum);
        scanner.close();
    }

    public static int sumBytes(byte b1, byte b2) {
        // Type casting: convert byte to int
        int int1 = (int) b1;
        int int2 = (int) b2;

        return int1 + int2;
    }
}