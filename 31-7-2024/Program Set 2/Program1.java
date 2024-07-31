import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int len = arr.length;

        // Reading input into the array
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating an object and calling the display method
        Program1 obj = new Program1();
        obj.display(arr, len);
        
    }

    // Method to display the array
    void display(int arr[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
