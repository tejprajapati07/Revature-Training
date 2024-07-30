import java.util.*;
public class Program10 {
    void reverse(int n){
        int r,s=0;
        while(n>0){
            r = n%10;
            s *= 10;
            s += r;
            n = n/10;
        }
        System.out.println("The Reverse number is "+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Program10 obj = new Program10();
        obj.reverse(n);
    }
}
