package baekjoon;

import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sec = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'A' || ch == 'B' || ch == 'C' ) {
                sec = sec+3;

            }
            else if(ch == 'D' || ch == 'E' || ch == 'F' ) {
                sec = sec+4;
            }
            else if(ch == 'G' || ch == 'H' || ch == 'I' ) {
                sec = sec+5;
            }
            else if(ch == 'J' || ch == 'K' || ch == 'L' ) {
                sec = sec+6;
            }
            else if(ch == 'M' || ch == 'N' || ch == 'O' ) {
                sec = sec+7;
            }
            else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' ) {
                sec = sec+8;
            }
            else if(ch == 'T' || ch == 'U' || ch == 'V' ) {
                sec = sec+9;
            }
            else if(ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z' ) {
                sec = sec+10;
            }

        }
        System.out.println(sec);
    }
}
