
import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args) {

        int matematikN, fizikN, kimyaN, turkceN, tarihN, muzikN;
        float ortalama;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen matematik notunuzu giriniz");
        matematikN = input.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz");
        fizikN = input.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz");
        kimyaN = input.nextInt();

        System.out.println("Lütfen türkçe notunuzu giriniz");
        turkceN = input.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz");
        tarihN = input.nextInt();

        System.out.println("Lütfen müzik notunuzu giriniz");
        muzikN = input.nextInt();

        ortalama = (matematikN + fizikN + kimyaN + turkceN + tarihN + muzikN)/6;

        System.out.println("ortalamanız : " + ortalama);

        String str = (ortalama >= 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(str);

    }



}