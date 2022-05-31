import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;



public class NearestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        int min = 0, max = 0;

        // 5
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);

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

