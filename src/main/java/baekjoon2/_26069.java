package baekjoon2;

import java.util.Scanner;

public class _26069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 만난 기록 수
        int cnt =0 ;
        String[] Name = new String[N];
        for (int i = 0; i < N; i++) {
            if(sc.nextLine() == "ChongChong"){
                Name[i] = sc.next();
                cnt++;
            }
            if(sc.next() == "Name[i]"){
                Name[i] = sc.next();
                cnt++;
            }

        }
    }
}
