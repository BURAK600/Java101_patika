import java.util.Scanner;


public class SayiSirala {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Sirasiyla birbirinden farklı a,b,c sayilarini giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a<b && a<c){
            if (b<c){
                System.out.println("Siralama : a<b<c");

            }else{
                System.out.println("Siralama : a<c<b");
            }
        }
        else if(b<a && b<c){
            if (a<c){
                System.out.println("Siralama : b<a<c");

            }else{
                System.out.println("Siralama : b<c<a");
            }
        }
        else{
            if (b<a){
                System.out.println("Siralama : c<b<a");

            }else{
                System.out.println("Siralama : c<a<b");
            }
        }
    }
}
