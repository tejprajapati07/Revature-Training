import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);
    }

    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}