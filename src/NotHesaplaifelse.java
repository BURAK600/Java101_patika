import java.util.Scanner;


public class NotHesaplaifelse {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen matematik notunu giriniz: ");
        mat = input.nextInt();
        if (mat>100 && mat<0){
            mat = 0;
        }
        System.out.print("Lutfen fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (fizik>100 && fizik<0){
            fizik = 0;
        }
        System.out.print("Lutfen turkce notunu giriniz: ");
        turkce = input.nextInt();
        if (turkce>100 && turkce<0){
            turkce = 0;
        }
        System.out.print("Lutfen kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (kimya>100 && kimya<0){
            kimya = 0;
        }
        System.out.print("Lutfen muzik notunu giriniz: ");
        muzik = input.nextInt();
        if (muzik>100 && muzik<0){
            muzik = 0;
        }

        double averaga = (mat+fizik+turkce+kimya+muzik)/5;
        if (averaga < 55){
            System.out.println("Sinifta kaldiniz");
        }
        else{
            System.out.println("Tebrikler sinifi gectiniz");
        }
        System.out.println("Ortalamaniz : " + averaga);
    }


}
