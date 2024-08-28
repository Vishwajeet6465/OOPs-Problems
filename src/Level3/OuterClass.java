package Level3;

//Outer class
public class OuterClass {
 // Static Inner class
 static class InnerClass {
     // Non-static method
     void show() {
         System.out.println("Inside static InnerClass's non-static method.");
     }
 }

 // Method of Outer class
 void outerMethod() {
     System.out.println("Inside OuterClass's method.");
 }

 public static void main(String[] args) {
     // Creating an instance of the static inner class
     InnerClass innerObject = new InnerClass();
     
     // Calling the non-static method of the static inner class
     innerObject.show();

     // Creating an instance of the outer class
     OuterClass outerObject = new OuterClass();
     
     // Calling the outer class method
     outerObject.outerMethod();
     
     // Static inner class can also be instantiated without the outer class object
     OuterClass.InnerClass anotherInnerObject = new OuterClass.InnerClass();
     anotherInnerObject.show();
 }
}

