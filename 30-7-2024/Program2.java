import java.util.Scanner;

public class Program2 {
    void perimeter_tri(int a, int b, int c){
        int perimeter;
        perimeter = a + b + c;
        System.out.println("Perimeter of a triangle is "+ perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Program2 obj = new Program2();
        obj.perimeter_tri(a, b, c);
    }
    
}
