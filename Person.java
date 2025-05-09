package tr.edu.maltepe.oop;

import java.io.Serializable;

public class Person implements Serializable, Cloneable {
    private String name;
    private int age;
    private Department department;

    // Constructors
    public Person(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Method to return info as string
    public String writeinfo() {
        return "Person [name=" + name + ", age=" + age + ", department=" + department + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.department = new Department(department.getName(), department.getLocation());
        return cloned;
    }
}
