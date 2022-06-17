public class AsalSayi {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {

            int i = 2;
            boolean check = true;
            if (!(n >= 2)) {
                System.out.println(n + " is not a prime number!");

            } else {
                while (i <= Math.sqrt(n)) {
                    if (n % i == 0) {
                        check = false;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(n + " is a prime number");
                }
            }

        }
    }
}