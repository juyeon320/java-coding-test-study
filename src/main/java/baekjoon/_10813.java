package baekjoon;

import java.util.Scanner;

public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니 갯수
        int M = sc.nextInt(); // M 번 바꿀 것

        int[] arr = new int [N+1];

        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        int a =0 ; int b =0;
        int temp =0;

        for  (int i = 0; i < M; i++) {
            a = sc .nextInt();
            b = sc.nextInt();
            temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
        }

        for(int i = 1; i < N+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
