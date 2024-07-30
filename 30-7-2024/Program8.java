
import java.util.Scanner;

public class Program8 {
    void find(int num){
        if(num<10000 || num>99999){
            System.out.println("This is not a five digit number");
            return;
        }
        int firstDigit = num / 10000;
        int secondLastDigit = (num / 10) % 10;
        int sum = firstDigit + secondLastDigit;
        System.out.println("Sum of the first and the second last digit is "+ sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            num = sc.nextInt();
            Program8 obj = new Program8();
            obj.find(num);
        }
    }

