
import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double toplamTutar, armut = 2.14,elma = 3.67, domates = 1.11 ,muz =  0.95 ,patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? :");
        int armutkg = input.nextInt();
        System.out.print("Elma Kac Kilo ? :");
        int elmakg = input.nextInt();
        System.out.print("Domates Kac Kilo ? :");
        int domateskg = input.nextInt();
        System.out.print("Muz Kac Kilo ? :");
        int muzkg = input.nextInt();
        System.out.print("Patlican Kac Kilo ? :");
        int patlicankg= input.nextInt();
        toplamTutar = armut * armutkg + elma*elmakg + domates*domateskg + muz*muzkg + patlican*patlicankg;

        System.out.println("Toplam tutar :" + toplamTutar);



    }


}
