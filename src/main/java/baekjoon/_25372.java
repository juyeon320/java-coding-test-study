package baekjoon;

import java.util.Scanner;

public class _25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문자열 총 갯수
        sc.nextLine(); // 개행 제거
        while (N-- > 0) {
            String a = sc.nextLine();

            if (a.length() >= 6 && a.length() <= 9 ){
                System.out.println("yes");
            }
            else  {
                System.out.println("no");
            }
        }

    }
}
