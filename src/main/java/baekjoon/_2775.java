package baekjoon;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] people = new int[15][15];
        for (int i = 1; i< 15; i ++){
            people[0][i] = i; // 0 층 초기화
        }

        for (int i = 1; i< 15; i++){
            for (int j = 1; j< 15; j++){
                people[i][j] = people[i][j-1] + people[i-1][j];
            }
        }

        int T = sc.nextInt();

        while (T-- > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt(); // 입력 받기
            System.out.println(people[k][n]);

        }

    }
}
