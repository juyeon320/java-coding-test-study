package baekjoon;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int c =0;

        for(int i =0; i< 10; i++){
            arr[i] = sc.nextInt()%42; //일단 배열에 전부 다 저장떄림
            for (int j =0; j< i; j++){
                if(arr[i]==arr[j]){
                    c --;
                    break;
                }
            }
            c++;
        }
        System.out.println(c);

    }
}
