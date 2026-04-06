package lab3.problem5;

import lab3.problem4.Employee;
import lab3.problem4.Manager;
import java.util.Arrays;
import java.util.Date;

public class SortTest {
    public static void main(String[] args) {
        // Sort Chocolates
        System.out.println("=== Sorting Chocolates (Bubble Sort) ===");
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.5),
            new Chocolate("Snickers", 52.0),
            new Chocolate("Mars", 45.0),
            new Chocolate("KitKat", 41.5),
            new Chocolate("Bounty", 57.0)
        };
        System.out.println("Before: " + Arrays.toString(chocolates));
        Sort.bubbleSort(chocolates);
        System.out.println("After:  " + Arrays.toString(chocolates));

        // Sort Times
        System.out.println("\n=== Sorting Times (Merge Sort) ===");
        Time[] times = {
            new Time(14, 30, 0),
            new Time(8, 15, 45),
            new Time(23, 59, 59),
            new Time(0, 0, 1),
            new Time(12, 0, 0)
        };
        System.out.println("Before: " + Arrays.toString(times));
        Sort.mergeSort(times);
        System.out.println("After:  " + Arrays.toString(times));

        // Sort Employees
        System.out.println("\n=== Sorting Employees (Bubble Sort) ===");
        Employee[] employees = {
            new Employee("Charlie", 48000, new Date(122, 2, 10), "NI-003"),
            new Manager("Diana", 75000, new Date(119, 8, 20), "NI-004", 10000),
            new Employee("Alice", 55000, new Date(120, 0, 15), "NI-001"),
            new Manager("Eve", 75000, new Date(121, 0, 5), "NI-005", 15000),
            new Employee("Bob", 62000, new Date(118, 5, 1), "NI-002")
        };
        System.out.println("Before: " + Arrays.toString(employees));
        Sort.bubbleSort(employees);
        System.out.println("After:  " + Arrays.toString(employees));
    }
}
