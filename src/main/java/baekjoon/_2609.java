package baekjoon;

import java.util.Scanner;


public class _2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp =0;

        if (b<a){
            tmp = a ;
            a = b;
            b = tmp;
        }

        int max = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i; // 이게 최대공약수임
            }
        }

        int i =1;
        int j =1;
        int A = 0;
        int B = 0;

        int min =0;

       while(true) {
           A = a*i;
           B = b*j;

           if (A == B) {
               min = A;
               break;
           }
           else if (A > B) {
               j++;
           }
           else{
               i++;
           }

       }

       System.out.println(max);
       System.out.println(min);


    }
}
