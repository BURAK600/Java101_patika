
import java.util.Scanner;


public class DaireDilimiAlani {

    public static void main(String[] args) {

        double alan, π = 3.14;
        int r,a;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez acisinin olcusunu giriniz : ");
        a = input.nextInt();

        alan = ( π* (r*r) * a) / 360;

        System.out.println("Dairenin alani : " + alan);
    }
}
