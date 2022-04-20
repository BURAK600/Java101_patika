
import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {

        int kg;
        double m, vce;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz :");
        m = input.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz :  ");
        kg = input.nextInt();
        vce = kg/(m*m);
        System.out.println("Vucut Kitle Indeksiniz :" + vce);


    }
}
