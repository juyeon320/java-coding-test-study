package baekjoon;

import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N==1){
            System.out.println(" ");
        }
        else if (N==2){
            System.out.println("2");
        }
        else {
            int i =2;
            while(N>1){
                if (N%i==0){
                    System.out.println(i);
                    N = N / i;
                }
                else {
                    i++;
                }
            }
        }


    }
}
