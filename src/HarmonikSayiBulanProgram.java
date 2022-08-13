import java.util.Scanner;

public class HarmonikSayiBulanProgram {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Sayi giriniz");

        int n = scanner.nextInt();

        double harmonikSeri = 0.0;

        for (int i = 1; i<=n; i++){
            harmonikSeri += (double)1/i;

        }

        System.out.println("Harmonik seri: " + harmonikSeri);
    }
}
