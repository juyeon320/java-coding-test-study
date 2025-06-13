package baekjoon2;

import java.util.Scanner;

public class _11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextInt();
        int a =0;
        int b=0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 동전의 가치가 오름차순으로 주어짐
            if (arr[i] <= K){
                a = i;
            }
        }
        long cnt =0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                cnt += K / arr[i];  // 해당 동전 몇 개 쓸 수 있는지
                K %= arr[i];        // 남은 금액 갱신
            }
        }
        System.out.println(cnt);

    }
}
