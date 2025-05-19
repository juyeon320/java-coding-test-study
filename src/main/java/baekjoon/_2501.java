package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N의 약수들 중
        int K = sc.nextInt(); // k 번째로 작은 수를 출력하는 프로그램
        int[] arr = new int[N]; // 약수들 저장할 배열 만들기
        for (int i = 0; i < N; i++) {
            arr[i] = 10000;
        }

        int j=0;

        for (int i=1; i<=N; i++){
            if(N%i==0){
                arr[j] = i;
                j++;
            }
        }


        if(arr[K-1] == 10000){
            System.out.println(0);
        }
        else {
            System.out.println(arr[K-1]);
        }

    }
}
