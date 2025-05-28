package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum =0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        sum = sum / 5;
        Arrays.sort(arr); // 오름차순 정렬
        int result = arr[2];
        System.out.println(sum);
        System.out.println(result);
    }
}
