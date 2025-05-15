package baekjoon;
import java.util.Scanner;

public class _24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 2;
        for(int i =0; i<N-1; i++){
            count = count*2;
        }
        System.out.println(count);

    }
}
