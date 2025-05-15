package baekjoon;

import java.util.*;

public class _25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바이트 정수 입력
        int M = N/4;
        for (int i = 0; i < M; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
