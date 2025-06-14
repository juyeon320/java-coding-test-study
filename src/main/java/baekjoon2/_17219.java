package baekjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _17219 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 첫 줄 입력 (N, M)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 저장된 사이트 수
        int M = Integer.parseInt(st.nextToken());  // 비밀번호를 찾을 사이트 수

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password =  st.nextToken();
            map.put(site, password);
        }

        for (int i = 0; i < M; i++) {
           String query = br.readLine();
           sb.append(map.get(query)).append("\n");
        }

        System.out.println(sb);



    }
}
