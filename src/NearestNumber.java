import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;



public class NearestNumber {
    public static void main(String[] args) {



        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        Scanner input = new Scanner(System.in);
        int number;

        // girilen sayı dizinin elemanlarının en küçüğünden büyük ve en büyüğünden küçük olmalı
        do {

            System.out.print("Number: ");
            number = input.nextInt();
        }
        while(!(number>arr[0] && number<arr[arr.length-1]));
        int min = 0, max = 0;


        for (int i = 0;i<arr.length;i++)
        {
            if (number<arr[i]){
                max = arr[i];
                min = arr[i-1];
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    }

