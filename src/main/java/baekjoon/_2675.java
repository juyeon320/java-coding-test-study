package baekjoon;

import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트케이스 갯수
        while (T>0) {
            T -- ;
            int R = sc.nextInt(); //반복횟수
            String S = sc.next();    // 문자열 입력
            StringBuilder sb = new StringBuilder();  // 출력 문자열

            for (int i =0; i< S.length(); i++){
                char ch = S.charAt(i);
                for (int j =0; j < R; j++){
                    sb.append(ch);
                }
            }

            System.out.println(sb.toString());



        }
    }
}
