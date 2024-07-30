
import java.util.Scanner;

public class Program6 {
    void fah_to_celc(int feh){
        double cel;
        cel = ((feh - 32)*(5.0/9.0));
        System.out.println("celius temperature is " + cel);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feh;
        feh = sc.nextInt();
        Program6 obj = new Program6();
        obj.fah_to_celc(feh);
    }
}
