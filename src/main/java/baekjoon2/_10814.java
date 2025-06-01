package baekjoon2;

import baekjoon._10250;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _10814 {
    static class Member {
        int age;
        String name;
        int order;

        Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 온라인 저지 회원 수

        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(age, name, i); // i => 가입 순서
        }
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age != m2.age) {
                    return m1.age - m2.age; // 나이 순 정렬
                }
                return m1.order - m2.order;// 나이가 같으면 가입 순서
            }
        });

        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }

        }
    }

