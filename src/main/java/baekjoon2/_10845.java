package baekjoon2;

import java.io.*;
import java.util.StringTokenizer;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] queue = new int[10001];  // 최대 10,000명 명령이므로 충분히 큼
        int front = 0;
        int back = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue[back++] = x;
                    break;
                case "pop":
                    if (front == back) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue[front++]).append("\n");
                    }
                    break;
                case "size":
                    sb.append(back - front).append("\n");
                    break;
                case "empty":
                    sb.append(front == back ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (front == back) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue[front]).append("\n");
                    }
                    break;
                case "back":
                    if (front == back) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue[back - 1]).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
