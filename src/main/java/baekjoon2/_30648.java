package baekjoon2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _30648 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int R = sc.nextInt();
        Map<String, Integer > flowermap = new HashMap<>();
        int time =0;

        while (true){
            int x =a ;
            int y =b ;
            while (true){
                String key = x + "," + y;
                flowermap.put(key,flowermap.getOrDefault(key,0) + 1);
                if(flowermap.get(key) >= 2){
                    System.out.println(time);
                    return;
                }
                if(x + 1 + y + 1 < R){
                    x = x + 1;
                    y = y + 1;
                } else {
                    x = x/2;
                    y = y/2;
                }
                time ++;
            }

        }


    }
}
