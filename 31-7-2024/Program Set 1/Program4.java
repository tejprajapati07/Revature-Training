import java.util.Scanner;

public class Program4 {
    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program4 obj = new Program4();
        int[] numbers = new int[10];
        
        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Calculate and print the average
        double average = obj.calculateAverage(numbers);
        System.out.printf("Average is: %.2f\n", average);
        
        sc.close();
    }
}