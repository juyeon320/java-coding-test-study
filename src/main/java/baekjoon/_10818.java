package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수의 갯수
        int[] arr = new int[N];

        for (int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
        System.out.print(" ");
        System.out.print(arr[N-1]);
    }
}
