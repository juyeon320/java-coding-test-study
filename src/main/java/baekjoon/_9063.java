package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrx = new int[N]; // x
        int[] arry = new int[N]; //y
        for (int i = 0; i < N; i++) {
            arrx[i] = sc.nextInt();
            arry[i] = sc.nextInt();
        }
        Arrays.sort(arrx);
        Arrays.sort(arry);
        int res = (arrx[N -1] - arrx[0]) * (arry[N -1] - arry[0]);
        System.out.println(res);
    }
}
