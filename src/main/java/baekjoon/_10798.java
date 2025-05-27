package baekjoon;

import java.util.Scanner;

public class _10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];
        // 초기화: 공백
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // 세로로 읽기
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) { // 열
            for (int i = 0; i < 5; i++) { // 행
                if (arr[i][j] != '\0') {
                    sb.append(arr[i][j]);
                }
            }
        }

        System.out.println(sb.toString());


    }
}
