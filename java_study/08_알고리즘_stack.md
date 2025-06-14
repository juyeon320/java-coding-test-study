# 자바에서 스택 사용법

## 선언

```
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
Stack<String> stack = new Stack<>();
Stack<Character> stack = new Stack<>();

```

## 주요 사용법

| 메서드            | 설명                  |
| -------------- | ------------------- |
| `push(E item)` | 스택에 요소 추가           |
| `pop()`        | 스택에서 맨 위 요소 꺼냄 (제거) |
| `peek()`       | 맨 위 요소 확인만 함 (제거 X) |
| `isEmpty()`    | 비어 있으면 `true`       |
| `size()`       | 스택에 들어있는 요소 개수      |
| `clear()`      | 모든 요소 제거            |

## 예제코드
```
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");

        System.out.println(stack.peek());   // cherry
        System.out.println(stack.pop());    // cherry
        System.out.println(stack.pop());    // banana
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.pop());    // apple
        System.out.println(stack.isEmpty()); // true
    }
}

```