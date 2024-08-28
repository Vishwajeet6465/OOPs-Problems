package Level1;

public class TV {
    // Instance variables
    private String brand;
    private int size; // Size in inches
    private double price;

    // Constructor to initialize the TV object
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Method to calculate the discount based on the TV's size
    public double calculateDiscount() {
        double discount = 0.0;
        if (size >= 40 && size < 50) {
            discount = 0.10; // 10% discount for sizes between 40 and 49 inches
        } else if (size >= 50 && size < 60) {
            discount = 0.15; // 15% discount for sizes between 50 and 59 inches
        } else if (size >= 60) {
            discount = 0.20; // 20% discount for sizes 60 inches and above
        }
        return price * discount;
    }

    // Method to print the TV's brand, size, and discounted price
    public void printTVDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("TV Brand: " + brand);
        System.out.println("TV Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    // Main method to test the TV class
    public static void main(String[] args) {
        // Create a TV object
        TV myTV = new TV("Samsung", 55, 999.99);

        // Print the TV details
        myTV.printTVDetails();
    }
}
