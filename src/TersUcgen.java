import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");

        int n = scanner.nextInt();
        int k =0;
        while(2*n!=0){


            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }
            for(int i = 0;i<2*n-1;i++){

                System.out.print("*");
            }

            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }
            System.out.println();
            k++;

            n--;
        }
    }
}
