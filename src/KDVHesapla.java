
import java.util.Scanner;

public class KDVHesapla {

    public static void main(String[] args) {
        double KDVsizFiyat, KDVFiyat, KDVTutar, KDVOranı;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak tutari giriniz :");
        KDVsizFiyat = input.nextDouble();

        KDVOranı = (KDVsizFiyat > 0 && KDVsizFiyat < 1000) ? 0.18 : 0.08;

        KDVTutar = KDVsizFiyat * KDVOranı;


        System.out.println("KDV tutari : " + KDVTutar);


    }
}
