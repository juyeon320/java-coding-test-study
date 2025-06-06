package baekjoon2;

import java.util.Scanner;

public class _1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //int len = str.length();
        String s =  sc.nextLine();
        //int l = s.length();
        int count = 0;
        int index = 0;

        while (index <= str.length() - s.length()) {
            if (str.substring(index, index + s.length()).equals(s)) {
                count++;
                index += s.length();
            }
            else {
                index++;
            }

        }
        System.out.println(count);


    }
}
