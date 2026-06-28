class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Naveen");
        employee.display();
    }
}
