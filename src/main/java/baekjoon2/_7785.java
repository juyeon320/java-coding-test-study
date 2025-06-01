package baekjoon2;

import java.util.*;

public class _7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 로그에 기록된 출입 기록의 수 n

        HashSet<String> company = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next(); // 이름
            String status = sc.next(); // 상태 입력 받기

            if (status.equals("enter")) {
                company.add(name); // 상태가 엔터면 이름 추가
            }else if (status.equals("leave")){
                company.remove(name); // 리브면 이름 제거 오오오
            }
        }
        List<String> result = new ArrayList<>(company);
        Collections.sort(result, Collections.reverseOrder());
        for (String name : result) {
            System.out.println(name);
        }


    }

}
