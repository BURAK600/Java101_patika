
import java.awt.image.TileObserver;
import java.util.Scanner;
public class CiftDortToplamı {
    public static void main(String[] args) {
        int n,sayac = 0,k =0;
        float total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        n = input.nextInt();
        while(n%2==0 && n%4 ==0){
            sayac +=1;
            k +=n;
            total = k/sayac;
            System.out.println("Bir sayi giriniz: ");
            n = input.nextInt();
        }
        System.out.println("Toplam: " + total);
        

    }
}
