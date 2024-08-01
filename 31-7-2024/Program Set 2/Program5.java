import java.util.*;
public class Program5 {
    int sum_(int[] arr){
        int sum=0;
        for(int i=0;i<2;i++){
            sum += arr[i];
        }
        return sum;
    }
    double avg_(int[] arr,int k){
        double avg=0;
        avg = k/2;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        double r;
        int[] arr = new int[10];
        for(int i=0;i<2;i++){
            arr[i] = sc.nextInt();
        }
        Program5 obj = new Program5();
        k = obj.sum_(arr);
        System.out.println("The sum of the elements is "+k);
        r = obj.avg_(arr,k);
        System.out.println("The average of the elements is "+r);
    }
}
