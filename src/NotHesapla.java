
import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args) {

        int matematikN, fizikN, kimyaN, turkceN, tarihN, muzikN;
        float ortalama;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz");
        matematikN = input.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz");
        fizikN = input.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz");
        kimyaN = input.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz");
        turkceN = input.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz");
        tarihN = input.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz");
        muzikN = input.nextInt();

        ortalama = (matematikN + fizikN + kimyaN + turkceN + tarihN + muzikN)/6;

        System.out.println("ortalamaniz : " + ortalama);

        String str = (ortalama >= 60) ? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println(str);

    }



}