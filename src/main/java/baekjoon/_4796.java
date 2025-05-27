package baekjoon;

import java.util.Scanner;

public class _4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //연속하는 8일 중 5일만 사용할 수 있을대 휴가 20일 받음 ->
        // 8일/8일/4일
        // 5일/5일/ 4일 -> 14일 ? 20/8 -> 2 + 4 -> 5*2 + 4

        // 휴가 17일 받으면 ->
        // 8일/8일/1일 ?
        int cnt = 1;
        while(true){
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            int result = 0;

            if (L == 0 && P == 0 && V == 0){
                break;
            }
            else {
                result = (V / P) * L + Math.min(V % P, L);
                System.out.println("Case " + cnt + ": " + result);
            }
            cnt++;
        }

    }
}
