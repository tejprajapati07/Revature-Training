import java.util.*;
public class Program8 {
    int armstrong(int n){
        int t = n;
        int r,s=0;
        while(n>0){
            r = n%10;
            s += r*r*r;
            n = n/10;
        }
        if(s == t){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Program8 obj = new Program8();
        int k = obj.armstrong(n);
        if(k==1){
            System.out.println("This is a Arm Strong number");
        }
        else{
            System.out.println("This is not a Arm Strong Number");
        }
    }
}
