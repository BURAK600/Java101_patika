import java.util.Scanner;
public class Fibonacci {
    static int fibo(int n)
    {
        if (n==1 || n==0){
            return 1;
        } else if (n<0) {
            return 0;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        System.out.println(fibo(n));
    }
}
