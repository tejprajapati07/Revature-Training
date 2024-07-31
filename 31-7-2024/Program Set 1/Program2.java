import java.util.*;
public class Program2 {
    void grading(int marks){
        if(marks<25){
            System.out.println("Your grade is  F");
        }
        else if(marks>=25 && marks<45){
            System.out.println("Your grade is E");
        }
        else if(marks>=45 && marks<50){
            System.out.println("Your grade is D");
        }
        else if(marks>=50 && marks<60){
            System.out.println("Your grade is C");
        }
        else if(marks>=60 && marks<80){
            System.out.println("Your grade is B");
        }
        else {
            System.out.println("Your grade is A");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks;
        marks=sc.nextInt();
        Program2 obj = new Program2();
        obj.grading(marks);
    }
}
