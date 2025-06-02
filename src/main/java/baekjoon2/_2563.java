package baekjoon2;

import java.util.Scanner;

public class _2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이의 수
        int[][] Paper = new int[100][100];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // 색종이 칠하기
            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    Paper[j][k] = 1;
                }
            }
        }
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (Paper[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }

}
