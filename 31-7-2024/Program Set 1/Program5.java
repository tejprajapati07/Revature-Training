import java.util.*;
public class Program5 {
    void print_pattern(){
        for(int i = 1; i<5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    void print_pattern2(){
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print binary numbers
            for (int k = 0; k < (rows - i); k++) {
                System.out.print("1");
                if (k < (rows - i - 1)) {
                    System.out.print("0");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program5 obj = new Program5();
        System.out.println("Printing the first pattern");
        obj.print_pattern();
        System.out.println("Printing the second pattern");
        obj.print_pattern2();
    }
}
