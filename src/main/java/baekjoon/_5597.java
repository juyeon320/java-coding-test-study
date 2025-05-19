package baekjoon;

import java.util.Scanner;

public class _5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30]; // 30칸짜리 배열 선언
        int x =0;

        for (int i = 0; i < 30; i++) { //30칸 전부 0으로 초기화시키기
            arr[i] = 0;
        }

        for (int i = 0; i < 28; i++) {
            x = sc.nextInt();
            arr[x-1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if(arr[i] == 0){
                System.out.println(i+1);
            }

        }

    }
}
