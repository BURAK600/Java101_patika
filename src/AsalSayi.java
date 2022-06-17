public class AsalSayi {
    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {

            int i = 2;
            boolean check = true;
            if (!(n >= 2)) {
            } else {
                while (i <= Math.sqrt(n)) {
                    if (n % i == 0) {
                        check = false;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(n + ",");
                }
            }

        }
    }
}