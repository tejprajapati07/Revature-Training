
import java.util.Scanner;

public class Program4 {
    void reverse(int[] arr){
        int num,d=0;
        int[] k = new int[10];
        for(int i=9;i>=0;i--){
            num=arr[i];
            k[d++]=num;
        }
        for(int i=0;i<10;i++){
            System.out.println(k[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        Program4 obj = new Program4();
        obj.reverse(arr);
    }
}
