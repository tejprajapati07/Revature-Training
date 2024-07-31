import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int product = 1;
        boolean firstInput = true; // To handle the first product initialization

        while (true) {
            System.out.print("Enter an integer (or press 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
                sum += number;
                
                if (firstInput) {
                    product = number;
                    firstInput = false;
                } else {
                    product *= number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            double average = (double) sum / numbers.size();
            System.out.println("Average of numbers: " + average);
            System.out.println("Product of numbers: " + product);
        }
    }
}