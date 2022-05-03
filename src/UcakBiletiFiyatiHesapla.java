
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class UcakBiletiFiyatiHesapla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int yas,distance, yolculukTipi;

        System.out.println("Gidilen mesafe: ");
        distance = input.nextInt();
        System.out.println("Yasınızı giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz \n 1 : Tek Yon \n 2 : Gidis-Donus)");
        yolculukTipi = input.nextInt();
        float toplamFiyat = distance*(float) 0.1;

        if ((distance>0 && yas>0) && (yolculukTipi ==1 || yolculukTipi ==2) ) {
            if (yas < 12) {
                toplamFiyat = toplamFiyat * (float) 0.5;
            } else if (yas >= 12 && yas < 24) {
                toplamFiyat = toplamFiyat - toplamFiyat * (float) 0.1;
            } else if (yas > 65) {
                toplamFiyat = toplamFiyat - toplamFiyat * (float) 0.3;
            } else if (yolculukTipi == 2) {
                toplamFiyat = toplamFiyat - toplamFiyat * (float) 0.2;
            }
        }
        else {
            System.out.println("Hatalı bilgi girdiniz!");
        }
            System.out.println("Odenecek toplam tutar : " + toplamFiyat);
        }
    }

