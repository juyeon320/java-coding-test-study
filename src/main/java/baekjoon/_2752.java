package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2752 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr); // 정렬? 하는거인듯
        for (int i = 0; i < 3; i++) {
           System.out.print(arr[i] + " ");
        }
    }
}
