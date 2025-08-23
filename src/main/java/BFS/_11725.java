package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11725 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        graph = new ArrayList[N+1]; // 그래프 선언
        for(int i = 1;i<=N;i++){ // 그래프 초기화
            graph[i] = new ArrayList<>();
        }

        for (int i = 0;i<N-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b); // graph[0,{6,4},4,{6,5},{1,7,2},3,{1,3},4]
            graph[b].add(a);//           1    2   3      4    5   6   7
        }

        visited =  new boolean[N+1];
        parent = new int[N+1];
        bfs(1);// 1이 루트기 때문.

        for(int i = 2; i<=N;i++){
            System.out.println(parent[i]);
        }
    }

    static void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s); //q[1]
        visited[s] = true;//visit[,T,,,,,,]
        while(!q.isEmpty()){
            int cur = q.poll(); //cur = 1
            for (int next : graph[cur]){ //현재 정점과 연결된 모든 정점들 다 방문할때까지 반복
                if(!visited[next]) { // 아직 방문 안한 정점이면
                    visited[next] = true; // 방문 표시하고
                    parent[next] = cur; // p[6], p[4] = 1
                    q.add(next); // 큐에 넣기
                }
            }
        }
    }
}
