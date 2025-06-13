package baekjoon2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] arr = new String[N+1];
        Map<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i < N+1; i++) {
            String name = sc.next();
            arr[i] = name;
            nameToNum.put(name, i);
        }

        for (int i =0; i <M; i++){
            String q = sc.next();
            try {
                int num = Integer.parseInt(q);
                System.out.println(arr[num]);
            } catch (NumberFormatException e) {
                System.out.println(nameToNum.get(q));  // 이름 → 번호
            }
        }



    }
}
