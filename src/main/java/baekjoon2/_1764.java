package baekjoon2;


import java.util.Arrays;
import java.util.Scanner;

public class _1764 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] name = new String[N+M];
        for (int i = 0; i < N+M; i++) {
            name[i] = sc.next();
        }
        Arrays.sort(name);
        int cnt = 0;
        int j =0;
        String[] collection = new String[N+M];
        for (int i = 1; i < N+M; i++) {
            if (name[i-1].equals(name[i])){
                cnt++;
                collection[j] = name[i-1];
                j++;
            }
        }
        System.out.println(cnt);
        for (int h = 0; h < cnt; h++) {
            System.out.println(collection[h]);
        }



    }
}
