package baekjoon;

import java.util.Scanner;

public class _16676 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 근우의 목표연봉 입력

        String str = String.valueOf(N);
        int[] count = new int[10];

        for(int i=0;i<str.length(); i++){
            int digit = str.charAt(i) - '0';
            count[digit]++;
        }

        int max = 0;
        for(int i =0; i< 10; i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        System.out.println(max);
    }
}
