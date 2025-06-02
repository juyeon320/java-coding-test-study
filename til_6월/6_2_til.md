# 6월 2일 til

## PriorityQueue
- 사용법 : PriorityQueue<> pq = new PriorityQueue<>();
### 🔍 PriorityQueue란?
- Java에서 제공하는 우선순위 큐 자료구조
- 자동으로 정렬된 순서로 요소를 꺼낼 수 있음
- 기본적으로 오름차순 정렬(min-heap 구조)
→ **가장 작은 값이 먼저 나온다**

```
PriorityQueue<Long> pq = new PriorityQueue<>();
```
- Long 타입의 숫자를 저장하는 우선순위 큐 생성
- 값을 넣으면 자동으로 작은 값이 먼저 나옴

| 메서드                       | 설명                 |
| ------------------------- | ------------------ |
| `add(E e)` / `offer(E e)` | 요소 추가              |
| `poll()`                  | 가장 작은 값을 꺼내고 제거    |
| `peek()`                  | 가장 작은 값을 꺼내지 않고 조회 |
| `size()`                  | 큐 크기 반환            |
| `isEmpty()`               | 비었는지 확인            |

### 예시코드
```
PriorityQueue<Long> pq = new PriorityQueue<>();
pq.offer(5L);
pq.offer(2L);
pq.offer(8L);

System.out.println(pq.poll()); // 2
System.out.println(pq.poll()); // 5
System.out.println(pq.poll()); // 8
```
### 주의사항 
- PriorityQueue는 내부적으로 Heap 구조를 사용하므로, 정렬된 리스트처럼 인덱스로 정렬된 순서에 접근은 불가능함 (get(i) 같은 거 안 됨)
- poll() 할 때마다 자동으로 정렬 유지됨

내림차순 정렬로 바꾸고 싶으면:
```
PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
```

## replace
- 문자열에서 특정 문자 또는 문자열을 다른 문자/문자열로 바꿔주는 메서드
- 원본 문자열은 변하지 않고, 바뀐 문자열을 새로리턴함
- 문자열 내 모든 일치 항목을 바꿔준다

### 📘 문법

```
String result = original.replace(oldChar, newChar);          // 문자(char) 대체
String result = original.replace(oldString, newString);      // 문자열(String) 대체
```

### 🧪 예제

```
String s = "apple banana apple";
String r1 = s.replace("apple", "orange");
System.out.println(r1); // "orange banana orange"
String r2 = s.replace('a', '*');
System.out.println(r2); // "*pple b*n*n* *pple"
```

### 🔁 자주 쓰이는 패턴

✅ 특정 패턴 제거하기
```
String s = "hello!";
s = s.replace("!", "");  // "hello"
```

✅ 여러 개 치환하기 (연속 사용 가능)
```
String s = "abcabc";
s = s.replace("a", "1").replace("b", "2");  // "12c12c"
```

✅ 크로아티아 알파벳 문제처럼 치환 처리
```
String s = "c=c-dz=lj";
s = s.replace("dz=", "*");
s = s.replace("c=", "*");
System.out.println(s);  // "**-*lj"
```

### ⚠️ 주의사항
"replace()"는 모든 일치 항목을 바꾼다 (한 번만 바꾸고 싶으면 안 맞음)

정규표현식 사용 시는 replaceAll()을 써야 함

문자열은 **불변(immutable)**이기 때문에 원본 문자열은 바뀌지 않음
→ 반드시 결과를 변수에 저장해야 함!

