package baekjoon;

import java.util.*;

public class _4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();


        if(A.length()<B.length()){ //재환이가 낼 수 있는 길이가 의사가 요구하는 길이보다 짧다면
            System.out.println("no");
        }
        else{
            System.out.println("go");
        }
    }
}
