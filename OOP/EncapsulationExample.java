class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Naveen");

        System.out.println("Student Name: " + student.getName());
    }
}
