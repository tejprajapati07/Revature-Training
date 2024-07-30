import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudents = 90;
        int boys = 45;
        int girls = totalStudents - boys; 
        int gradeAStudents = (int) (0.5 * totalStudents);
        int boysGradeA = 20;
        int girlsGradeA = gradeAStudents - boysGradeA;
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }
}
