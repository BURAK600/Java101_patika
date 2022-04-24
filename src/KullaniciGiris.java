import java.sql.SQLOutput;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen kullanici adinizi giriniz: ");
        userName = input.nextLine();
        System.out.print("Lutfen sifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Sisteme giris yaptiniz");
        }
        else{
            System.out.println("Bilgilerinizi yanlis girdiniz\n Sifrenizi degistirmek isterseniz Y, istemezseniz N yaziniz");
            String X = input.nextLine();
            if (X.equals("Y")){
                System.out.print("Yeni sifrenizi giriniz :");
                password = input.nextLine();
                if (password.equals("patika")){
                    System.out.println("Yeni sifreniz eski sifre ile ayni olamaz. Lutfen baska sifre giriniz");
                    password = input.nextLine();
                    if (password.equals("patika")) {
                        System.out.println("Yeni sifreniz eski sifre ile ayni olamaz. Lutfen baska sifre giriniz");
                    }
                    else{
                        System.out.println("Sifreniz olusturuldu");

                }

                }

                else{
                    System.out.println("Sifreniz olusturuldu");
                }
                } else if (X.equals("N")) {
                System.out.println("Sistemden cikis yaptiniz");}
                else{
                System.out.println("Isleminiz gercekleştirilemedi");

                }

            }


        }



        }







