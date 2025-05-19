package baekjoon;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        //int[] arr = new int[N]; //N 개 배열 만들기
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 숫자 전부 다 입력받기

            if (a == 2 || a == 3) cnt++; // 입력받은 숫자가 2나 3이면 ..
            else if (a == 1) continue;
            else if (a > 3){
                for (int j = 2; j < a/2 +1 ; j++) {
                    if (a%j == 0) { // 나눠 떨어지면
                        break;
                    }
                    else if (j == a/2) {
                        cnt++;
                    }

                }
            }
        }
        System.out.println(cnt);

    }
}
