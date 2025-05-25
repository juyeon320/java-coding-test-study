package baekjoon;

import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase(); // 대소문자 무시

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++; //알파벳 갯수 세기
        }

        int max =0;
        char result = '?'; // 애초에 문자열로 저장

        for (int i = 0; i < 26; i++) { // 가장 많이 쓰인 알파벳 찾기
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A');
            }
            else if (arr[i] == max) { // 최빈값이 여러개면
                result = '?';
            }
        }

        System.out.println(result);


    }
}
