import java.util.Scanner;

public class HavaSicakligiEtkinlikOnerme {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sicaklik degeri giriniz: ");
        temp = input.nextInt();
        if (temp<5){
            System.out.println("Kayak yapilabilir");
        }else if(temp>=5 && temp<25){
            if (temp<15){
                System.out.println("Sinemaya gidilebilir");
            } else if (temp>=15) {
                System.out.println("Piknige gidilebilir");
            }

        } else if (temp>25) {
            System.out.println("Yuzmeye gidilebilir");

        }
    }
}
