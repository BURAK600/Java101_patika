import java.util.Scanner;

public class SumOfOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        do{
            System.out.println("Enter a number");
            n = scanner.nextInt();
            if(n%2==0){
                sum +=n;
            }

        }while(n%2==0);

        System.out.println("Sum of even number: " +sum);


    }

}
