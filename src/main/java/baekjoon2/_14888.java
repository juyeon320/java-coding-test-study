package baekjoon2;

import java.util.Scanner;

public class _14888 {
    static int N;
    static int[] arr;
    static int[] op;
    static int max = Integer.MIN_VALUE; // int가 가질 수 있는 가장 작은 값 ,아무 결과보다도 작다”로 시작하게 해서, 처음 비교에서 반드시 갱신되도록 하려는 것.
    static int min = Integer.MAX_VALUE; //int가 가질 수 있는 가장 큰 값 , " 크다 """"""

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        op = new int[4];
        for (int i = 0; i < 4; i++) op[i] = sc.nextInt();

        dfs(1, arr[0]);

        System.out.println(max);
        System.out.println(min);
        sc.close();
    } 


    static void dfs(int idx, int curr) {
        if (idx == N) {
            max = Math.max(max, curr);
            min = Math.min(min, curr);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] == 0) continue;
            op[i]--;
            int next = apply(curr, arr[idx], i);
            dfs(idx + 1, next);
            op[i]++;
        }
    }

    static int apply(int a, int b, int i) {
        switch (i) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            default:
                if (a < 0) return -(Math.abs(a) / b);
                return a / b;
        }
    }
}
