import java.util.*;
public class Program9 {
    void sum_digit(int n){
        int r,sum=0;
        while(n>0){
            r = n % 10;
            sum += r;
            n = n/10;
        }
        System.out.println("The sum of digit are "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        Program9 obj = new Program9();
        obj.sum_digit(num);
    }

}
