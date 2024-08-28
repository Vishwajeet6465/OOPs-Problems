package Level3;

//Super class
class Super {
 String str;

 // Constructor of Super class
 public Super(String s) {
     str = s;
     System.out.println("Super class constructor: " + str);
 }
}

//Sub class
public class Sub extends Super {
 String substr;

 // Constructor of Sub class
 public Sub(String s, String subs) {
     super(s); // Calls the Super class constructor
     substr = subs;
     System.out.println("Sub class constructor: " + substr);
 }

 // Method to print the strings
 public void printStrings() {
     System.out.println("String from Super class: " + str);
     System.out.println("String from Sub class: " + substr);
 }

 public static void main(String[] args) {
     Sub obj = new Sub("Hello", "World");
     obj.printStrings();
 }
}