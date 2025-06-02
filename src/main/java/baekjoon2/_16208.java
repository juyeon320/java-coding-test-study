package baekjoon2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _16208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 현우가 원하는 쇠막대의 수
        PriorityQueue<Long> pq =  new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextLong()); // 요소 넣기
        }
        long cost = 0;
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            cost += first * second;
            pq.offer(first + second);
        }
        System.out.println(cost);
    }
}
