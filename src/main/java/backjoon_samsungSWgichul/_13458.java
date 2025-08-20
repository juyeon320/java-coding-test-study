package backjoon_samsungSWgichul;

import java.util.Scanner;

public class _13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총 시험장 갯수
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        long result = 0;
        int j =1;
        for (int i = 0; i < n; i++) {
            int students = A[i];

            // 총감독관 1명은 무조건 필요
            result += 1;
            students -= B;

            // 남은 학생이 있으면 부감독관 필요
            if (students > 0) {
                result += (students + C - 1) / C; // 부감독관 수 (올림 계산)
            }
        }


        System.out.println(result);


    }
}
