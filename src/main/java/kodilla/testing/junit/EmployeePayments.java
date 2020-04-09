package kodilla.testing.junit;

public class EmployeePayments {

    private final double salary;
    private final double bonus;
    private final double yearlyBonus;

    public EmployeePayments(double salary, double bonus, double yearlyBonus) {
        this.salary = salary;
        this.bonus = bonus;
        this.yearlyBonus = yearlyBonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    @Override
    public String toString() {
        return "EmployeePayments{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeePayments that = (EmployeePayments) o;

        if (Double.compare(that.salary, salary) != 0) return false;
        if (Double.compare(that.bonus, bonus) != 0) return false;
        return Double.compare(that.yearlyBonus, yearlyBonus) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yearlyBonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
