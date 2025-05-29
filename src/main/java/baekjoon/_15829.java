package baekjoon;

import java.util.Scanner;

public class _15829 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 문자열 길이
        String str = sc.next(); // 영문 소문자로만 이루어진 문자열
        long sum = 0;
        long r = 1;
        int M = 1234567891;
        for (int i = 0; i<L; i++){
            char ch = str.charAt(i);
            sum = (sum + (ch - 'a' + 1)*r)%M;
            r = r*31%M;
        }
        long result = sum;
        System.out.println(result);

    }
}
