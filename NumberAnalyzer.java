import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update largest and smallest numbers
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            // Add number to sum
            sum += number;

            // Increment count
            count++;

            // Ask user if they want to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Calculate average
        double average = (double) sum / count;

        // Display results
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
        System.out.println("Average of all the numbers entered: " + average);

        scanner.close();
    }
}
