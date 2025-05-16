package baekjoon;

import java.util.Scanner;

public class _27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수 입력
        long result = 1;

        for (int i = 1; i <= N; i++) {
            result = result*i;
        }

        System.out.println(result);
    }
}
