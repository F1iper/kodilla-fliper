package kodilla.testing.junit;

import java.util.*;

public class EmployeeList {

private final String username;
private final String realName;
private final String peselId;

final Map<EmployeeList, EmployeePayments> getMap(){

    EmployeeList employee1 = new EmployeeList("nicky", "Nicolas Cage", "00001");
    EmployeeList employee2 = new EmployeeList("sam", "Samuel Jackson", "00002");
    EmployeeList employee3 = new EmployeeList("joey", "Joey Ricky", "00003");

    EmployeePayments pay1 = new EmployeePayments(3300, 200, 500);
    EmployeePayments pay2 = new EmployeePayments(4300, 300, 600);
    EmployeePayments pay3 = new EmployeePayments(6300, 500, 1000);

    Map<EmployeeList, EmployeePayments> map = new HashMap<>();
        map.put(employee1, pay1);
        map.put(employee2, pay2);
        map.put(employee3, pay3);

        for (Map.Entry<EmployeeList, EmployeePayments> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());

    }
    return new HashMap<>(map);
}

    public EmployeeList(String username, String realName, String peselId) {
        this.username = username;
        this.realName = realName;
        this.peselId = peselId;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeList that = (EmployeeList) o;

        return Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return username != null ? username.hashCode() : 0;
    }
}