package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] arr = new float[N];
        for (int i = 0; i < N; i++) {
           arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 오름차순으로 정렬

        float max = arr[N-1]; // 최댓값
        float add =0;

        for (int i =0; i<N; i++){
            arr[i] = arr[i]/max*100;
            add = add + arr[i];
        }
        float result = add/N ;

        System.out.println(result);

    }
}
