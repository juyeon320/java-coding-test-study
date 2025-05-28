package baekjoon;

import java.util.Scanner;



public class _25501 {
    static int count;

    public static int recursion(String s, int l, int r){
        count ++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args){
        //System.out.println("ABBA: " + isPalindrome("ABBA"));
        //System.out.println("ABC: " + isPalindrome("ABC"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(T-- > 0){
            String s = sc.next();
            System.out.println(isPalindrome(s) + " " + count);
            count = 0;


        }



    }
}
