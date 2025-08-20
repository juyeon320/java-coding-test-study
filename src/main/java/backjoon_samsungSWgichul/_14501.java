package backjoon_samsungSWgichul;

import java.util.Scanner;

public class _14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] T = new int[n];
        int[] P = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        int[] dp = new int[n + 2];

        for (int i = 0; i <= n; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            if (i<n && i + T[i] <= n) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }
        int max = 0;
        for (int i = 0; i <= n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
