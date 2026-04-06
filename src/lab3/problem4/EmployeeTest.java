package lab3.problem4;

import java.util.Arrays;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Date d1 = new Date(120, 0, 15); // Jan 15, 2020
        Date d2 = new Date(118, 5, 1);  // Jun 1, 2018
        Date d3 = new Date(122, 2, 10); // Mar 10, 2022
        Date d4 = new Date(119, 8, 20); // Sep 20, 2019

        Employee emp1 = new Employee("Alice", 55000, d1, "NI-001");
        Employee emp2 = new Employee("Bob", 62000, d2, "NI-002");
        Employee emp3 = new Employee("Charlie", 48000, d3, "NI-003");

        Manager mgr1 = new Manager("Diana", 75000, d4, "NI-004", 10000);
        Manager mgr2 = new Manager("Eve", 75000, new Date(121, 0, 5), "NI-005", 15000);

        mgr1.addEmployee(emp1);
        mgr1.addEmployee(emp2);

        System.out.println("=== Employees ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(mgr1);
        System.out.println(mgr2);

        // Comparable: sort by salary (managers with equal salary compare by bonus)
        System.out.println("\n=== Sort by Salary (Comparable) ===");
        Employee[] employees = {emp2, mgr2, emp1, emp3, mgr1};
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Comparator: sort by name
        System.out.println("\n=== Sort by Name ===");
        Arrays.sort(employees, Employee.byName());
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Comparator: sort by hire date
        System.out.println("\n=== Sort by Hire Date ===");
        Arrays.sort(employees, Employee.byHireDate());
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Clone test
        System.out.println("\n=== Clone Test ===");
        Employee emp1Clone = emp1.clone();
        System.out.println("Original: " + emp1);
        System.out.println("Clone:    " + emp1Clone);
        System.out.println("equals:   " + emp1.equals(emp1Clone));
        System.out.println("== :      " + (emp1 == emp1Clone));

        // Modify clone's hire date — original should not be affected (deep copy)
        emp1Clone.getHireDate().setYear(130);
        System.out.println("After modifying clone's date:");
        System.out.println("Original hireDate: " + emp1.getHireDate());
        System.out.println("Clone hireDate:    " + emp1Clone.getHireDate());

        // Manager clone
        Manager mgr1Clone = mgr1.clone();
        System.out.println("\nManager clone team size: " + mgr1Clone.getTeam().size());
        mgr1Clone.getTeam().clear();
        System.out.println("After clearing clone's team:");
        System.out.println("Original team size: " + mgr1.getTeam().size());
        System.out.println("Clone team size:    " + mgr1Clone.getTeam().size());

        // Equals test
        System.out.println("\n=== Equals Test ===");
        Employee emp1Copy = new Employee("Alice", 55000, new Date(120, 0, 15), "NI-001");
        System.out.println("emp1.equals(emp1Copy): " + emp1.equals(emp1Copy));
        System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));
    }
}
