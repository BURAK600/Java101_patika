import java.util.Scanner;

public class HipotenusBul {

    public static void main(String[] args) {


        double kenar1, kenar2, kenar3, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        kenar1 = input.nextDouble();
        kenar2 = input.nextDouble();
        kenar3 = input.nextDouble();

        double cevre = kenar1 + kenar2 + kenar3;

        double u = cevre/2;
        alan = Math.sqrt((u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
        System.out.println("ucgenin alani : " + alan);

    }
}
