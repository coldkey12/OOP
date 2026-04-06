package lab3.problem5;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        System.out.println("=== Sorting Chocolates (Bubble Sort) ===");
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50),
            new Chocolate("Snickers", 52.7),
            new Chocolate("KitKat", 41.5),
            new Chocolate("Mars", 45)
        };
        Sort.bubbleSort(chocolates);
        System.out.println(Arrays.toString(chocolates));

        System.out.println("\n=== Sorting Times (Merge Sort) ===");
        Time[] times = {
            new Time(14, 30, 0),
            new Time(8, 15, 45),
            new Time(23, 59, 59),
            new Time(0, 0, 1)
        };
        Sort.mergeSort(times);
        System.out.println(Arrays.toString(times));

        System.out.println("\n=== Sorting Chocolates (Merge Sort) ===");
        Chocolate[] chocs2 = {
            new Chocolate("Bounty", 57),
            new Chocolate("Milky Way", 21.5),
            new Chocolate("Toblerone", 100)
        };
        Sort.mergeSort(chocs2);
        System.out.println(Arrays.toString(chocs2));
    }
}
