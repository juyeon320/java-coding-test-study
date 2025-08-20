package baekjoon2;

import java.util.Scanner;

public class _10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stack = new int[N];
        int j =0;
        String[] commands = new String[N];
        for (int i = 0; i < N; i++) {
            commands[i] = sc.next();
            if(commands[i].equals("push")) {
                stack[j] = sc.nextInt();
                j++;
            }
            else if(commands[i].equals("pop")) {
                if (j == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[--j]);
                }
            }
            else if(commands[i].equals("size")) {
                System.out.println(j);
            }
            else if(commands[i].equals("empty")) {
                if(j>0){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }
            else if(commands[i].equals("top")) {
                if (j == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[j - 1]);
                }
            }
        }
    }
}
