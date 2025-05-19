package baekjoon;

import java.util.Scanner;

public class _5292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print("DeadMan");
                System.out.println(" ");
            }
            else if(i%3==0){
                System.out.print("Dead");
                System.out.println(" ");

            }
            else if(i%5==0){
                System.out.print("Man");
                System.out.println(" ");
            }

            else {
                System.out.print(i+" ");
            }
        }
    }
}
