package baekjoon;

import java.util.Scanner;

public class _2581 {
// 소수 판별함수
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i =2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum =0;
        int min = N;
        for (int i = M; i <= N; i++) {
            if (isPrime(i) == true){ // 소수면
                sum = sum + i;
                if(i<min){
                    min = i;
                }
            }


        }
        if (sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
