package baekjoon;

import java.util.Scanner;

public class _10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int H = sc.nextInt(); // 호텔 층 수 30 ,6
            int W = sc.nextInt(); // 각 층 방 수 50 ,12
            int N = sc.nextInt(); // 몇 번째 손님? 72 ,10
            int a = N%H; //12 ,4
            int b = N/H + 1; //2 ,1

            if(a == 0){
                a = H;
                b = N/H;
            }

           System.out.printf("%d%02d\n", a, b);
            T --;
        }

    }

    private static class string {
    }
}
