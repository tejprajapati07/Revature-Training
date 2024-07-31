import java.util.*;
class Program1{
    int check(int length, int breadth){
        if(length == breadth){
            return 1;
        }
        return 0;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int length,breadth;
        length = sc.nextInt();
        breadth = sc.nextInt();
        Program1 obj = new Program1();
        int k = obj.check(length, breadth);
        if(k==1){
            System.out.print("This is a square");
        }
        else{
        System.out.println("It is not a square");
        }
        }
    }


