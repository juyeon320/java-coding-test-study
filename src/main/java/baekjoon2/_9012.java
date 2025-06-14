package baekjoon2;

import java.util.Scanner;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
           String line = sc.next();
           Stack<Character> stack = new Stack<>();
           boolean isVPS = true;
           for (int i = 0; i < line.length(); i++) {
               char ch = line.charAt(i);

               if (ch == '(') {
                   stack.push(ch);
               }else if (ch == ')') {
                  if (stack.isEmpty()) {
                      isVPS = false;
                      break;
                  } else {
                      stack.pop();
                  }
               }
           }
           if (isVPS && stack.isEmpty()) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }

        }

    }
}
