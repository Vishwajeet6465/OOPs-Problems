package Level1;

public class Furniture {
    // Instance variables
    private String type;
    private String material;
    private double price;

    // Constructor to initialize the Furniture object
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    // Method to calculate the discount based on the material
    public double calculateDiscount() {
        double discount = 0.0;
        switch (material.toLowerCase()) {
            case "wood":
                discount = 0.10; // 10% discount for wooden furniture
                break;
            case "metal":
                discount = 0.15; // 15% discount for metal furniture
                break;
            case "plastic":
                discount = 0.05; // 5% discount for plastic furniture
                break;
            default:
                discount = 0.0; // No discount for other materials
                break;
        }
        return price * discount;
    }

    // Method to print the Furniture's type, material, and discounted price
    public void printFurnitureDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;

        System.out.println("Furniture Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    // Main method to test the Furniture class
    public static void main(String[] args) {
        // Create a Furniture object
        Furniture myFurniture = new Furniture("Chair", "Wood", 150.00);

        // Print the furniture details
        myFurniture.printFurnitureDetails();
    }
}
