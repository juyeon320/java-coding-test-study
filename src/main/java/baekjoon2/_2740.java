package baekjoon2;

import java.util.Scanner;

public class _2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr =  new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int M2 = sc.nextInt();
        int K = sc.nextInt();
        int[][] brr = new int[M][K];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < K; j++) {
                brr[i][j] = sc.nextInt();
            }
        }

        int[][] rrr = new int [N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < M; k++) {
                 rrr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(rrr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
