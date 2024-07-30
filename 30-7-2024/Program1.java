import java.util.*;
class Program1
{
    void area_rectangle(int length, int breadth)
    {
        int area;
        area = length * breadth;
        System.out.println("The area of rectangle is "+ area);
    }
    void perimeter_rectangle(int length, int breadth)
    {
        int perimeter;
        perimeter = 2 * (length + breadth);
        System.out.println("The area of rectangle is "+ perimeter);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length, breadth;
        length = sc.nextInt();
        breadth = sc.nextInt();

        Program1 ob = new Program1();
        
        ob.area_rectangle(length, breadth);
        ob.perimeter_rectangle(length, breadth);
    }
}