package Level1;

public class Shirt {
    // Instance variables
    private String size;
    private String color;
    private double price;

    // Constructor to initialize the Shirt object
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // Method to calculate the discount based on the shirt's size
    public double calculateDiscount() {
        double discount = 0.0;

        // Discount based on size
        switch (size.toLowerCase()) {
            case "s":
                discount = 0.05; // 5% discount for small size
                break;
            case "m":
                discount = 0.10; // 10% discount for medium size
                break;
            case "l":
                discount = 0.15; // 15% discount for large size
                break;
            case "xl":
                discount = 0.20; // 20% discount for extra-large size
                break;
            default:
                discount = 0.0; // No discount for other sizes
                break;
        }
        return price * discount;
    }

    // Method to print the Shirt's size, color, and discounted price
    public void printShirtDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("Shirt Size: " + size);
        System.out.println("Shirt Color: " + color);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    // Main method to test the Shirt class
    public static void main(String[] args) {
        // Create a Shirt object
        Shirt myShirt = new Shirt("M", "Blue", 30.00);

        // Print the shirt details
        myShirt.printShirtDetails();
    }
}
