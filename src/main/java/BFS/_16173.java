package BFS;
import java.util.*;


public class _16173 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// 게임 구역의 크기
        int[][] arr = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0}); // 방문 할 좌표들이 들어있슴
        visited[0][0] = true; // 방문 했슴표시

        while(!q.isEmpty()){ // 큐 빌때까지 반복쓰
            int[] cur = q.poll();   // 큐에서 하나 꺼낸건 컬임.
            int x = cur[0], y = cur[1]; // 현재 좌표 (x,y)

            if (arr[x][y] == -1) {   // 도착했으면 끝
                System.out.println("HaruHaru");
                return;
            }
            int jump = arr[x][y];

            if(x + jump < N && !visited[x+jump][y]){ // x 방향으로 점프했는데 좌표 안이고 방문 안한 곳이라면
                visited[x+jump][y] = true; // 방문  처리하고
                q.add(new int[]{x+jump, y}); // q에 좌표 넣기.
            }
            if (y + jump < N && !visited[x][y + jump]) { // 이번엔 오른쪽으로 이동
                visited[x][y + jump] = true;
                q.add(new int[]{x, y + jump});
            }

        }
        System.out.println("Hing");

    }
}
