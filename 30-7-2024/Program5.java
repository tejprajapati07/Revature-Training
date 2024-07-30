import java.util.*;
public class Program5 {
    void normal_swap(int a, int b){
        int c=0;
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping the value of a is "+ a); 
        System.out.println("After Swapping the value of b is "+ b);    
    }
    void second_swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping the value of a is "+ a); 
        System.out.println("After Swapping the value of b is "+ b);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        Program5 obj = new Program5();
        obj.normal_swap(a, b);
        obj.second_swap(a, b);
    }
}

