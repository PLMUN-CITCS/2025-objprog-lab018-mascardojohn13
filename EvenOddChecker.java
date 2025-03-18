import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput(); // Get user input
        String result = checkEvenOrOdd(number); // Check if even or odd
        System.out.println(result); // Display the result
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Ensure valid integer input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // Discard invalid input
        }
        
        int num = scanner.nextInt();
        scanner.close(); // Close scanner to avoid resource leaks
        return num;
    }

    // Method to determine if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
