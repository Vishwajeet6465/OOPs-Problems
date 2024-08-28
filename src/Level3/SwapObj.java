package Level3;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class SwapObj {
    static void swap(Employee e1, Employee e2) {
        Employee temp = e1;
        e1 = e2;
        e2 = temp;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25);
        Employee e2 = new Employee("Alice", 30);

        System.out.println("Before swapping:");
        e1.display();
        e2.display();

        swap(e1, e2);

        System.out.println("After swapping:");
        e1.display();
        e2.display();
    }
}
