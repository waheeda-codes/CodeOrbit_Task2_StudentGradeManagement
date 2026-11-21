import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Invalid number! Enter again:");
            n = sc.nextInt();
        }

        String[] names = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter marks (0-100): ");
            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100:");
                marks[i] = sc.nextInt();
            }

            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];
        }

        System.out.println("\n--- Student Results ---");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }

        System.out.println("Average: " + (double) total / n);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}