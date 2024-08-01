import java.util.*;
public class Program7 {
    void max(int[] arr){
        int maximum = 0;
        for(int i=0;i<10;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println("The maximum element is "+ maximum);
    }
    void mini(int[] arr){
        int minimum = 0;
        for(int i=0;i<10;i++){
            minimum = arr[0];
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        System.out.println("The minimum element is "+ minimum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        Program7 obj = new Program7();
        obj.max(arr);
        obj.mini(arr);
    }
}
