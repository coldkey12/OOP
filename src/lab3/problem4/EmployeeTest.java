package lab3.problem4;

import java.util.Arrays;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, new Date(120, 0, 1), "NI001");
        Employee e2 = new Employee("Bob", 60000, new Date(118, 5, 15), "NI002");
        Employee e3 = new Employee("Charlie", 45000, new Date(121, 3, 10), "NI003");

        Manager m1 = new Manager("Diana", 70000, new Date(115, 0, 1), "NI004", 5000);
        Manager m2 = new Manager("Eve", 70000, new Date(116, 6, 1), "NI005", 8000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println("=== toString ===");
        System.out.println(e1);
        System.out.println(m1);

        System.out.println("\n=== equals ===");
        Employee e1copy = e1.clone();
        System.out.println("e1.equals(e1copy): " + e1.equals(e1copy));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        System.out.println("\n=== compareTo (by salary) ===");
        Employee[] employees = {e1, e2, e3, m1, m2};
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getSalary());
        }

        System.out.println("\n=== Sort by name ===");
        Arrays.sort(employees, Employee.nameComparator);
        for (Employee e : employees) {
            System.out.println(e.getName());
        }

        System.out.println("\n=== Sort by hire date ===");
        Arrays.sort(employees, Employee.hireDateComparator);
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getHireDate());
        }

        System.out.println("\n=== Clone ===");
        Manager m1clone = m1.clone();
        System.out.println("Original: " + m1);
        System.out.println("Clone: " + m1clone);
        System.out.println("Equal: " + m1.equals(m1clone));
        System.out.println("Same object: " + (m1 == m1clone));
    }
}
