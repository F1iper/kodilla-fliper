package javastart.collections.mapexercise;

import java.util.HashMap;
import java.util.Map;

public class Company {

    private Map<String, Employee> employees = new HashMap<>();

    boolean addEmployee(Employee employee) {
        String key = employee.getName() + " " + employee.getLastname();

        if (employees.containsKey(key)) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }
    }
     Employee getEmployee (String name, String lastname) {
        String key = name + " " + lastname;
        return employees.get(key);
     }

}
