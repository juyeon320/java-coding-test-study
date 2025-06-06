package baekjoon2;

import java.util.Scanner;

public class _13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = getGDC(a,b);
        long lcm = (a*b) / gcd;
        System.out.println(lcm);

    }

    private static long getGDC(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
