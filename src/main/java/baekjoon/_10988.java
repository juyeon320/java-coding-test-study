package baekjoon;

import java.util.Scanner;

public class _10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int N = word.length();
        int res = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(N-1-i)){
                res = 0;
                break;
            }
            else{
                res = 1;
            }
        }
        System.out.println(res);
    }
}
