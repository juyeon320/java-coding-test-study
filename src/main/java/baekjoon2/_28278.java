package baekjoon2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령의 수
        int[] stack = new int[N + 1];  // 1-based index 사용
        int top = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                top++;
                stack[top] = x;
            }
            else if (command == 2) {
                if (top == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack[top]).append("\n");
                    top--;
                }
            }
            else if (command == 3) {
                sb.append(top).append("\n");
            }
            else if (command == 4) {
                sb.append(top == 0 ? 1 : 0).append("\n");
            }
            else if (command == 5) {
                if (top == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack[top]).append("\n");
                }
            }
        }

        System.out.print(sb); // 한 번에 출력
    }
}
