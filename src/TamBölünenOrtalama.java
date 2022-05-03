import java.util.Scanner;

public class TamBölünenOrtalama {
    public static void main(String[] args) {
        int sayac = 0, number,k = 0;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac += 1;
                k +=i;

            }
        }
        average = k/sayac;
        System.out.println("3 ve 4' e tam bolunen sayilarin ortalamasi: " + average);
    }

}
