package Level3;

public class ConstructorChaining {
    int x;
    int y;

    
    public ConstructorChaining() {
        this(20); // Calls the second constructor with argument 20
    }

     
    public ConstructorChaining(int x) {
        this.x = x;
        System.out.println("Value of x: " + x);
    }

    
    public ConstructorChaining(int x, int y) {
        this(); // Calls the default constructor
        this.y = y;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Sum of x and y: " + (x + y));
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining(11, 12);
    }
}
