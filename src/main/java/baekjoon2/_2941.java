package baekjoon2;

import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("dz=","*");
        s = s.replace("c=","*");
        s = s.replace("c-","*");
        s = s.replace("d-","*");
        s = s.replace("lj","*");
        s = s.replace("nj","*");
        s = s.replace("s=","*");
        s = s.replace("z=","*");

        System.out.println(s.length());
    }
}
