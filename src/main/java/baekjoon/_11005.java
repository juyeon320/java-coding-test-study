package baekjoon;

import java.util.Scanner;

public class _11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt(); // 10진수라는 사실을 잊지 말것
        int B = sc.nextInt(); //B진수로 나타내기

        StringBuilder result = new StringBuilder();

        while(N > 0){
            long remainder = N % B;
            if (remainder < 10){
                result.append((char)(remainder+'0'));
            }
            else {
                result.append((char)(remainder - 10 + 'A'));
            }
            N/=B;
        }
        System.out.println(result.reverse().toString());





    }
}
