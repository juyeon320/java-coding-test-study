package baekjoon;

import java.util.*;

public class _13322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); // 알파벳 소문자로 이루어진 문자열
        int len = s.length();
        String[] str = new String[len];
        Integer[] nums = new Integer[len];
        for (int i = 0; i < len; i++) {
            nums[i] = i;
        }
        //|S|줄에 걸쳐, 문자열 S의 모든 접두사를 사전 순으로 정렬했을 때,
        // 목록의 첫 접두사부터 마지막 접두사까지
        // 각 접두사가 끝나는 인덱스를 순서대로 출력한다.
        // 문자열의 인덱스는 0부터 시작한다.
        //banana -> b, ba, ban, bana, banan, banana
        Arrays.sort(nums, (i1, i2) -> {
            int min = Math.min(i1 + 1, i2 + 1);
            for (int i = 0; i <= min; i++) {
                char c1 = s.charAt(i1 - min + i);
                char c2 = s.charAt(i2 - min + i);
                if (c1 != c2) return c1 - c2;
            }
            return (i1 + 1) - (i2 + 1);
        });

        for (int i : nums) {
            System.out.println(i);
        }

    }

}
