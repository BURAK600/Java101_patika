
import java.util.Scanner;

public class TaksimetreProgrami {

    public static void main(String[] args) {

        int km, acTaksi = 10;

        float taksiTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi giriniz : ");
        km = input.nextInt();
        taksiTutar = acTaksi+ (float) (km*2.20);

        float tutar = taksiTutar< 20 ? 20:taksiTutar;
        System.out.println("Taksi ucreti : " + tutar);


    }
}
