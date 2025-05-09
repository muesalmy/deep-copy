package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept = new Department("Computer Engineering", "Block A");
        Person person1 = new Person("Alice", 30, dept);

        // Deep copy
        Person person2 = (Person) person1.clone();
        person2.getDepartment().setLocation("Block B");

        System.out.println("Original Person: " + person1.writeinfo());
        System.out.println("Cloned Person: " + person2.writeinfo());
    }
}
