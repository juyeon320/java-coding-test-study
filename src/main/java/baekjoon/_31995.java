package baekjoon;

import java.util.Scanner;

//똑같은 게임말 두 개를 서로 대각선으로 이웃하게 올려두는 방법의 수

public class _31995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int r = ((N-1)*2)*(M-1);
        System.out.println(r);


    }
}
