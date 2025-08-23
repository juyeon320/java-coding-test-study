package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11724 {
    static int N,M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점 갯수
        M = sc.nextInt(); // 간선 갯수

        //그래프 초기화 시키기
        graph = new ArrayList[N+1];
        for(int i = 1;i<=N;i++){
            graph[i] = new ArrayList<>();
        }
        //간선입력
        for (int i = 0;i<M;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v); //양쪽에 넣어서 연결
            graph[v].add(u); //graph : [,{2,5},{1,5},{4},{3,6},{2,1},{4}]
        }

        visited = new boolean[N+1]; // visited : [T,T,T,T,T,T]
        int count = 0;

        for(int i = 1;i<=N;i++){
            if(!visited[i]){
                bfs(i);
                count++; //1,2
            }
        }

        System.out.println(count);

    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start); //정점을 큐에 넣음
        visited[start] = true; // 방문했다고 표시

        while(!queue.isEmpty()){ // 큐가 빌 때까지 반복
            int cur = queue.poll(); // -> 큐의 맨 앞 원소 꺼냄 (현재 탐색할 정점 : cur)

            for (int next : graph[cur]){ //현재 정점과 연결된 모든 정점들 다 방문할때까지 반복
                if(!visited[next]) { // 아직 방문 안한 정점이면
                    visited[next] = true; // 방문 표시
                    queue.add(next); // 큐에 넣기
                }
            }
        }
    }
}
