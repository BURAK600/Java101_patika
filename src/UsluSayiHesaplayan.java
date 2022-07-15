import java.util.Scanner;

public class UsluSayiHesaplayan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ussu alinacak sayi giriniz: ");
        int i = scanner.nextInt();
        System.out.println("Us olacak sayiyi giriniz: ");
        int j = scanner.nextInt();

        int total = 1;


        for (int k = 0; k<j;k++){

            total *=i;
        }

        System.out.println("cevap: " + total);


    }


}
