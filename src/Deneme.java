/*
public class Deneme {

    public static void main(String[] args) {
        int right = 100, left = 200;
        while(--left<++right){



        }
    }
}
*/

import com.sun.tools.javac.Main;

import java.util.Scanner;
public class Deneme {
    public static void main(String[] args) {
        int password;

        boolean isPasswordSuccess = false;
        while(!isPasswordSuccess){
            Scanner input = new Scanner(System.in);
            System.out.print("Lutfen sifrenizi giriniz: ");
            password = input.nextInt();
            if (password == 123){
                System.out.println("Sifreniz dogru. Giris yapiliyor");
                isPasswordSuccess = true;

            }else{
                System.out.println("Tekrar deneyiniz!");
            }

        }
    }

}
