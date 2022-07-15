import java.util.Scanner;

public class DortBesKuvveti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int i = scanner.nextInt();
        int j = 0, temp1= 1,temp2 = 1;
        boolean control = true;

        while(control){

            if(temp1*5>i)
            {
                temp1 /=5;
            }
            temp1 *= 5;
            System.out.println("5'in kuvvetleri" + temp1);

            if(temp2*4>i)
            {
                control = false;
                temp2 /=4;
            }
            temp2 *= 4;
            System.out.println("4'un kuvvetleri" + temp2);
            j++;

        }
    }


}
