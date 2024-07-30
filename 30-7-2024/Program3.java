import java.util.Scanner;

public class Program3 {
    void operation(){
        double answer,final_result;
        answer = (((8 + 2345)/3)%5);
        final_result = answer * 5;
        System.out.println("The final result is "+ final_result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Program3 obj = new Program3();
        obj.operation();
    }
}
