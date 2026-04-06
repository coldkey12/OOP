package lab3.problem4;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double salary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(String name, double salary) {
        this(name, salary, new Date(), "N/A");
    }

    public Employee(String name) {
        this(name, 0, new Date(), "N/A");
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public String getNationalInsuranceNumber() { return nationalInsuranceNumber; }
    public void setNationalInsuranceNumber(String nin) { this.nationalInsuranceNumber = nin; }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        try {
            Employee copy = (Employee) super.clone();
            copy.hireDate = (Date) this.hireDate.clone(); // deep copy of mutable Date
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', salary=" + salary +
               ", hireDate=" + hireDate + ", NIN='" + nationalInsuranceNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee e = (Employee) o;
        return Double.compare(e.salary, salary) == 0 &&
               Objects.equals(getName(), e.getName()) &&
               Objects.equals(nationalInsuranceNumber, e.nationalInsuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), salary, nationalInsuranceNumber);
    }

    // Comparator by name
    public static Comparator<Employee> byName() {
        return Comparator.comparing(Employee::getName);
    }

    // Comparator by hire date
    public static Comparator<Employee> byHireDate() {
        return Comparator.comparing(Employee::getHireDate);
    }
}
