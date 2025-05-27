package baekjoon;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int count =1;
        int range = 1; // 현재 범위의 끝번호
        while(N>range){
            range = range + 6*count;
            count++;
        }
        System.out.println(count);


    }
}
