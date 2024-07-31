
import java.util.Scanner;

public class Program3 {
    void calculate(int totalattend, int totalclass, char medical){
        double attendance;
        attendance = ((double)totalattend/totalclass)*100;
        if(attendance>=75 || medical=='Y'){
            System.out.println("You can sit for the exam");
        }
        else{
            System.out.println("You cannot sit for the exam");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalclass, totalattend;
        char medical;
        totalattend = sc.nextInt();
        totalclass = sc.nextInt();
        System.out.println("Do you have medical issue");
        medical = sc.next().toUpperCase().charAt(0);
        Program3 obj = new Program3();
        obj.calculate(totalattend, totalclass, medical);

    }
}
