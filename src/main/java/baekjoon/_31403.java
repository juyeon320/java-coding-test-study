package baekjoon;

import java.util.Scanner;

public class _31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result1 = A + B - C;
        System.out.println(result1);
//문자열로 이어붙인 후 계산
        String str = String.valueOf(A) + String.valueOf(B); // "A"+"B"
        int result2 = Integer.parseInt(str) - C;
        System.out.println(result2);


    }
}
