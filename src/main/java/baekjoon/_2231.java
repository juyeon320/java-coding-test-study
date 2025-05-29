package baekjoon;

import java.util.Scanner;

public class _2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result =0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int tmp = i;

            while(tmp > 0){
                sum += tmp % 10;
                tmp /= 10;

            }
            if (sum == N) {
                result = i;
                break;

            }
        }


       System.out.println(result);

    }
}
