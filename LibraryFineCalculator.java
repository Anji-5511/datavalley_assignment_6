import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();

        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1;
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5;
        } else {
            System.out.println("bership is canceled due to excessive delay.");
            System.exit(0);
        }

        System.out.println("fine for returning the book " + daysLate + " days late is: Rs. " + fine);

        scanner.close();
    }
}
