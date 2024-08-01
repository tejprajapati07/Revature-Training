import java.util.*;
public class Program2 {
    int checking(int[] arr,int num){
        for(int i=0;i<10;i++){
            if(arr[i]==num){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int num;
        num = sc.nextInt();
        Program2 obj = new Program2();
        int k = obj.checking(arr,num);
        if(k==1){
            System.out.println("The number is found in array");
        }
        else{
            System.out.println("The number is not present in array");
        }
    }
    
}
