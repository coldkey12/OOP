package lab1.problem1;

import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String s = input.nextLine();

            if (s.equalsIgnoreCase("Q")) {
                System.out.println("Average = " + data.getAverage());
                System.out.println("Maximum = " + data.getMax());
                break;
            }

            try {
                double v = Double.parseDouble(s);
                data.add(v);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
