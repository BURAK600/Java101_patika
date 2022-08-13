import java.util.Scanner;

public class BasamakSayilariToplami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();
        int temp = sayi;
        int toplam = 0;
        while(!(temp==0)){
            toplam += temp%10;
            temp = temp/10;

        }

        System.out.println( sayi + " sayisinin basamak tolami: " + toplam) ;

    }
}
