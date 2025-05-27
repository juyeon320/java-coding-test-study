package baekjoon;

import java.util.Scanner;

public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int n =1;
        int k =1;
        int a =1;
        int A = N-K;
        // NCK 출력하면 됨 -> N! / K!(N-K)!
        // N*(N-1)*(N-2)*...*(N-K) / K*(K-1)*...*(1)
        for (int i = 1; i < N + 1 ; i++) {
            n = n*i;
        }

        for (int i = 1; i < K + 1 ; i++) {
            k = k*i;
        }

        for (int i = 1; i < A+1 ; i++){
            a = a*i;
        }

        int result = n/(a*k);
        System.out.print(result);
    }
}
