package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 응시자수
        int k = sc.nextInt(); // 상 받는 사람 수
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score); // 오름차순 솔팅 ~~
        System.out.println(score[N-k]);

    }
}
