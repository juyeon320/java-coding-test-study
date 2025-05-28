package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//세 참가자의 입학 연도를 100으로 나눈 나머지를
// 오름차순으로 정렬해서 이어 붙인 문자열

// 세 참가자 중 성씨를 영문으로 표기했을 때의 첫 글자를
// 백준 온라인 저지에서 해결한 문제가 많은 사람부터 차례대로 나열한 문자열


public class _28114 {
    static class Person{
        int solved;
        int year;
        String surname;
        public Person(int solved, int year, String surname){
            this.solved = solved;
            this.year = year;
            this.surname = surname;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            String s = sc.next();
            people.add(new Person(p, y, s));
        }

        List<Integer> years = new ArrayList<>();
        for (Person person : people) {
            years.add(person.year % 100);
        }
        Collections.sort(years);

        StringBuilder team1 = new StringBuilder();
        for (int y : years) {
            if (y < 10) team1.append("0");
            team1.append(y);
        }

        people.sort((p1, p2) -> Integer.compare(p2.solved, p1.solved));

        StringBuilder team2 = new StringBuilder();
        for (Person person : people) {
            team2.append(person.surname.charAt(0));
        }
        System.out.println(team1.toString());
        System.out.println(team2.toString());
    }

}
