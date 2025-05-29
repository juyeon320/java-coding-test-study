package baekjoon;

import java.util.Scanner;

public class _1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result =1;
            int sum = 1;

            for (int i = 0; i < b; i++) {
                sum = (sum*a)%10;
            }
            if (sum ==0){
                sum = 10;
            }
            System.out.println(sum);
        }
    }
}
