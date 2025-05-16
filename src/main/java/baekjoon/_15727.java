package baekjoon;

import java.util.Scanner;

public class _15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 거리
        int t = 0;
        t = L/5;
        if (L%5!=0) {
            t++;
        }
        System.out.println(t);


    }
}
