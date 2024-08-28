package Level1;

public class Computer {
    // Instance variables
    private String processor;
    private int RAM; // RAM in GB
    private int storage; // Storage in GB

    // Constructor to initialize the Computer object
    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    // Method to calculate the price based on processor, RAM, and storage capacity
    public double calculatePrice() {
        double basePrice = 500.00; // Base price for a basic configuration
        double price = basePrice;

        // Adding price based on processor type
        if (processor.equalsIgnoreCase("i7")) {
            price += 200.00; // Additional cost for i7 processor
        } else if (processor.equalsIgnoreCase("i5")) {
            price += 150.00; // Additional cost for i5 processor
        } else if (processor.equalsIgnoreCase("i3")) {
            price += 100.00; // Additional cost for i3 processor
        }

        // Adding price based on RAM
        if (RAM > 8) {
            price += (RAM - 8) * 20.00; // $20 per GB over 8 GB
        }

        // Adding price based on storage
        if (storage > 500) {
            price += (storage - 500) * 0.50; // $0.50 per GB over 500 GB
        }

        return price;
    }

    // Method to print the Computer's processor, RAM, and storage capacity
    public void printComputerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    // Main method to test the Computer class
    public static void main(String[] args) {
        // Create a Computer object
        Computer myComputer = new Computer("i5", 16, 1000);

        // Print the computer details
        myComputer.printComputerDetails();
    }
}

