import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int x1,x2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz : ");
        x1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        x2 = input.nextInt();
        System.out.println("1: Toplama\n2: Cikarma\n3: Carpma\n4: Bolme");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama sonucu : " + (x1 + x2));
                break;
            case 2:
                System.out.println("Cıkarma sonucu : " + (x1 - x2));
                break;
            case 3:
                System.out.println("Carpma sonucu : " + (x1 * x2));
                break;
            case 4:
                if (x2==0) {
                    System.out.println("Bolen 0'a esit olamaz");
                    break;
                }
                else{
                        System.out.println("Bolme sonucu : " + (x1/x2));
                }
                break;
        }
        System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz");
    }
}

