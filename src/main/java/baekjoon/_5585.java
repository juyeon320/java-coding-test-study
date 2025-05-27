package baekjoon;

import java.util.Scanner;

public class _5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 타로가 지불 할 돈
        int change = 1000 - N;
        int count = 0 ;
        while(change>0) {
            if (change / 500 > 0) {
                count = count + change / 500;
                change = change % 500;
            }
            else if(change/100 > 0){
                count = count + change / 100;
                change = change % 100;
            }
            else if(change / 50 > 0){
                count = count + change / 50;
                change = change % 50;
            }
            else if(change / 10 > 0){
                count = count + change / 10;
                change = change % 10;
            }
            else if(change / 5 > 0){
                count = count + change / 5;
                change = change % 5;
            }
            else if (change /1 > 0){
                count = count + change;
                change = change % 1;
            }
        }
        System.out.println(count);
    }
}
