package baekjoon2;

import java.util.Scanner;

public class _1251 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.next();
            String answer = null;

            int len = word.length();
            for (int i = 1; i < len-1; i++) {
                for (int j = i+1; j < len; j++) {
                    String p1 = new StringBuilder(word.substring(0,i)).reverse().toString();
                    String p2 = new StringBuilder(word.substring(i,j)).reverse().toString();
                    String p3 = new StringBuilder(word.substring(j)).reverse().toString();

                    String combined = p1 + p2 + p3;
                    if (answer == null || combined.compareTo(answer) < 0) {
                        answer = combined;
                    }
                }
            }
            System.out.println(answer);

    }
}
