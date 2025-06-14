# Deque

## Deque란?
양쪽(앞/뒤)에서 삽입과 삭제가 가능한 큐

| 동작 | 앞(front)      | 뒤(back)      |
| -- | ------------- | ------------ |
| 삽입 | `addFirst()`  | `addLast()`  |
| 삭제 | `pollFirst()` | `pollLast()` |
| 조회 | `peekFirst()` | `peekLast()` |

## 자바에서 Deque 사용법

```
import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> deque = new ArrayDeque<>();
```

## 주요 메서드 정리
| 동작     | 메서드           | 설명                      |
| ------ | ------------- | ----------------------- |
| 앞에 추가  | `addFirst(x)` | 앞쪽에 원소 삽입               |
| 뒤에 추가  | `addLast(x)`  | 뒤쪽에 원소 삽입               |
| 앞에서 삭제 | `pollFirst()` | 앞쪽에서 원소 꺼냄 (없으면 `null`) |
| 뒤에서 삭제 | `pollLast()`  | 뒤쪽에서 원소 꺼냄              |
| 앞 조회   | `peekFirst()` | 앞쪽 원소 확인 (제거 X)         |
| 뒤 조회   | `peekLast()`  | 뒤쪽 원소 확인                |
| 크기     | `size()`      | 덱의 현재 원소 개수             |
| 비었는지   | `isEmpty()`   | `true`면 비어 있음           |


## 예제코드
```
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);  // 앞: 1
        deque.addLast(2);   // 앞: 1, 뒤: 2
        deque.addFirst(0);  // 앞: 0, 1, 2

        System.out.println(deque.peekFirst()); // 0
        System.out.println(deque.peekLast());  // 2

        System.out.println(deque.pollFirst()); // 0
        System.out.println(deque.pollLast());  // 2
        System.out.println(deque.pollFirst()); // 1
        System.out.println(deque.isEmpty());   // true
    }
}
```