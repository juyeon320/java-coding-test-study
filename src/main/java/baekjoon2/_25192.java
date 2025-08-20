package baekjoon2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _25192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //ㅊㅐ팅방으 ㅣ기록 수
        Set<String> set = new HashSet<>();
        int cnt =0;
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            if (input.equals("ENTER")) {
                set.clear();
            }
            else if (!set.contains(input)){
                cnt++;
                set.add(input);
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
