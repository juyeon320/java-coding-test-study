package baekjoon;

import java.util.Scanner;

public class _2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long v = sc.nextLong();
        // 막대 - A /
        long cnt = (v - B - 1) / (A - B) + 1 ;
        System.out.println(cnt);
    }
}
