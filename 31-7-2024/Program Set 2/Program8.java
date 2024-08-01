import java.util.Arrays;
import java.util.Scanner;

public class Program8 {

    // Method to find maximum and minimum differences and their pairs
    public static void findMaxMinDiffPairs(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Calculate maximum difference
        int maxDiff = arr[arr.length - 1] - arr[0];
        System.out.println("Maximum difference is " + maxDiff + " between pairs: (" + arr[0] + ", " + arr[arr.length - 1] + ")");

        // Calculate minimum difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Print pairs with minimum difference
        System.out.print("Minimum difference is " + minDiff + " between pairs: ");
        boolean firstPair = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                if (!firstPair) {
                    System.out.print(", ");
                }
                System.out.print("(" + arr[i] + ", " + arr[i + 1] + ")");
                firstPair = false;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate number of elements
        if (n <= 1) {
            System.out.println("Number of elements must be greater than 1.");
            return;
        }

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print max and min differences and their pairs
        findMaxMinDiffPairs(arr);

        scanner.close();
    }
}
