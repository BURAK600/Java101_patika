
import java.util.Scanner;

public class CinZodyagıHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYılı, kalan;
        System.out.println("Dogun yilinizi giriniz:");
        dogumYılı = input.nextInt();
        kalan = (dogumYılı%12);
        switch (kalan){
            case(1):
                System.out.println("Cin Zodyagi Burcunuz: Horoz ");
                break;
            case(2):
                System.out.println("Cin Zodyagi Burcunuz: Köpek");
                break;
            case(3):
                System.out.println("Cin Zodyagi Burcunuz: Domuz ");
                break;
            case(4):
                System.out.println("Cin Zodyagi Burcunuz: Fare ");
                break;
            case(5):
                System.out.println("Cin Zodyagi Burcunuz: Öküz ");
                break;
            case(6):
                System.out.println("Cin Zodyagi Burcunuz: Kaplan ");
                break;
            case(7):
                System.out.println("Cin Zodyagi Burcunuz: Tavsan ");
                break;
            case(8):
                System.out.println("Cin Zodyagi Burcunuz: Ejderha ");
                break;
            case(9):
                System.out.println("Cin Zodyagi Burcunuz: Yılan ");
                break;
            case(10):
                System.out.println("Cin Zodyagi Burcunuz: At ");
                break;
            case(11):
                System.out.println("Cin Zodyagi Burcunuz: Horoz ");
                break;
            case(12):
                System.out.println("Cin Zodyagi Burcunuz: Maymun ");
                break;
        }
    }
}
