package baekjoon2;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        int j =0;
        int f =0;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            switch (cmd) {
                case "push":
                    queue[j++] = Integer.parseInt(input[1]);
                    break;
                case "pop":
                    sb.append(j - f == 0 ? -1 : queue[f++] ).append("\n");
                    break;
                case "size":
                    sb.append(j - f).append("\n");
                    break;
                case "empty":
                    sb.append(j - f == 0 ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(j - f == 0 ? -1 : queue[f]).append("\n");
                    break;
                case "back":
                    sb.append(j - f == 0 ? -1 : queue[j - 1]).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }

}
