package baekjoon;

import java.util.Scanner;

public class _1264 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();
            if(s.equals("#")){
                break;
            }
            int count =0;
            for (int i =0; i<s.length(); i++){
                char ch = Character.toLowerCase(s.charAt(i)); // 대소문자 구분 없이
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
