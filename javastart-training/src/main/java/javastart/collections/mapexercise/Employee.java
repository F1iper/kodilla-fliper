package javastart.collections.mapexercise;

import java.util.Objects;

public class Employee {

    private String name;
    private String lastname;
    private double salary;

    public Employee(String name, String lastname, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name " + name + ", lastname " + lastname + ", salary " + salary;
    }
}