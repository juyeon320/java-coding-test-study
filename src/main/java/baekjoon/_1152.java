package baekjoon;

import java.util.Scanner;

public class _1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner객체 생성
        String input = scanner.nextLine().trim(); // 한 줄 입력받기

        if (input.isEmpty()) {
            System.out.println(0);
        }else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
    }
}
