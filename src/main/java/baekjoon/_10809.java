package baekjoon;

import java.util.Scanner;
public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] alphabet = new int[26]; // 알파벳 위치 저장 배열

        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
