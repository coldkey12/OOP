import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem #1
        String name = sc.next();
        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
        System.out.println("|"+name+"|");
        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");

        // Problem #2
        System.out.print("Enter side length a: ");
        double a = sc.nextDouble();
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
        System.out.printf("Area: %.2f\nPerimeter: %.2f\nDiagonal: %.2f\n", area, perimeter, diagonal);

        // Problem #3
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        String grade;
        if (score >= 95) grade = "A";
        else if (score >= 90) grade = "A-";
        else if (score >= 85) grade = "B+";
        else if (score >= 80) grade = "B";
        else if (score >= 75) grade = "B-";
        else if (score >= 70) grade = "C+";
        else if (score >= 65) grade = "C";
        else if (score >= 60) grade = "C-";
        else if (score >= 55) grade = "D+";
        else if (score >= 50) grade = "D";
        else grade = "F";
        System.out.println("Your grade: " + grade);

        // Problem #4
        System.out.print("Enter a, b, c: ");
        double qa = sc.nextDouble();
        double qb = sc.nextDouble();
        double qc = sc.nextDouble();
        double D = qb * qb - 4 * qa * qc;
        if (D < 0) {
            System.out.println("Error: Discriminant is negative, no real roots.");
        } else {
            double sqrtD = Math.sqrt(D);
            double denom = 2 * qa;
            double x1 = (-qb + sqrtD) / denom;
            double x2 = (-qb - sqrtD) / denom;
            System.out.printf("Roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }

        // Problem #5
        double balance = 1000.0;
        double interestRate = 0.05;
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("New balance after interest: %.2f\n", balance);

        // Problem #6
        sc.nextLine();
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}