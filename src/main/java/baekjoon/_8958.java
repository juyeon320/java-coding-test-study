package baekjoon;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //String[] A = new String[T];

        while (T-- > 0) { // 테스트케이스만큼 반복

           String S = sc.next();
           int score = 0 ;
           int c=1;
           for (int i =0; i<S.length(); i++){ // 문자열 길이만큼 반복
               if(S.charAt(i) == 'O'){ // 문제 맞추면
                   score = score + c; // 기존 점수에 더하기
                   c++;
               }
               else if(S.charAt(i) == 'X'){ // 틀리면
                   c = 1; // 1점으로 초기화
               }
           }
           System.out.println(score);


        }




    }
}
