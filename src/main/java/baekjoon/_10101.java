package baekjoon;

import java.util.Scanner;

public class _10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a + b + c != 180 ){
            System.out.println("Error");
        }

        else if(a == b && b == c){
            System.out.println("Equilateral");
        }
        else if (a == b || b == c || c == a ){
            System.out.println("Isosceles");
        }
        else if (a != b && b != c && c != a && a + b + c == 180 ){
            System.out.println("Scalene");
        }
    }
}
