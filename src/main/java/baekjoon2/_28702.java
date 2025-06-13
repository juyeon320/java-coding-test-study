package baekjoon2;

import java.util.Scanner;

public class _28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        int a = 0;
        int r = 0;
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
            if (s[i].equals("Fizz") || s[i].equals("Buzz") || s[i].equals("FizzBuzz")) {
                continue;
            } else {
                r = Integer.parseInt(s[i]);
                a = 3 - i;
            }
        }
        int result = r + a;
        if (result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (result % 3 == 0 && result % 5 != 0) {
            System.out.println("Fizz");
        }
        else if (result % 5 == 0 && result % 3 != 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(result);
        }


    }
}
