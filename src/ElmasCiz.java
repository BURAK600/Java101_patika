import java.util.Scanner;

public class ElmasCiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");

        int n = scanner.nextInt();
        int s = n;
        int k =0;

        while(2*n!=0){
            for(int j = n;j>0;j--){
                System.out.print(" ");
            }
            for(int i = 0;i<2*k-1;i++){

                System.out.print("*");
            }

            for(int j = n;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
            k++;

            n--;
        }
        k =0;
        for(int i = 0;i<2*k;i++){

            System.out.print("*");
        }

        while(2*s!=0){


            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }
            for(int i = 0;i<2*s-1;i++){

                System.out.print("*");
            }

            for(int j = 0;j<k;j++){
                System.out.print(" ");
            }
            System.out.println();
            k++;

            s--;
        }
    }
}
