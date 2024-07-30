import java.util.Scanner;
public class Program4 {
    void total(int marks1, int marks2, int marks3){
        int sum=0;
        sum = marks1 + marks2 + marks3;
        System.out.println("The total marks obtained is "+ sum);
    }
    void average(int marks1, int marks2, int marks3){
        double avg=0;
        avg = (marks1 + marks2 + marks3)/3;
        System.out.println("The total marks obtained is "+ avg);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        Program4 obj = new Program4();
        obj.total(marks1, marks2, marks3);
        obj.average(marks1, marks2, marks3);
    }
}
