
import java.util.Scanner;

public class KuvvetYazdir {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        number = input.nextInt();
        int j = 1;
        System.out.print("4'un kuvvetleri :");
        for (int i = 1; i < number; i *= 4) {

            System.out.print( i +",");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        System.out.print("5'in kuvvetleri :");
        for (int i = 1; i < number; i *= 5) {

            System.out.print(i +",");
        }
    }
}