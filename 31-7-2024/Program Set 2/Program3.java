import java.util.*;
public class Program3 {
    void count(int[] arr){
        int positive=0, negative=0, zero=0;
        for(int i=0;i<20;i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else if(arr[i]==0){
                zero++;
            }
        }
        System.out.println("The positive numbers are "+ positive);
        System.out.println("The negative numbers are "+ negative);
        System.out.println("The zero numbers are "+ zero);
    }
    void count_even_odd(int[] arr){
        int even=0,odd=0;
        for(int i=0;i<20;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The even numbers are "+ even);
        System.out.println("The odd numbers are "+ odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter 20 elements of array");
        for(int i=0;i<20;i++){
            arr[i]=sc.nextInt();
        }
        Program3 obj = new Program3();
        obj.count(arr);
        obj.count_even_odd(arr);
    }
}
