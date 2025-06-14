# 6월 14일

## HashMap
Key -> Value 쌍으로 데이터를 저장하는 자료구조 

## 기본 사용 법
```
Map<String, Integer> map = new HashMap<>();

// 값 넣기 (put)
map.put("Pikachu", 25);

// 값 가져오기 (get)
int number = map.get("Pikachu");  // 25

// 값 존재 확인 (containsKey)
if (map.containsKey("Pikachu")) {
    System.out.println("존재함!");
}

// 삭제 (remove)
map.remove("Pikachu");

// 전체 순회 (keySet 사용)
for (String key : map.keySet()) {
    System.out.println(key + " → " + map.get(key));
}

```

## HashSet과의 차이

| HashMap            | HashSet                    |
| ------------------ | -------------------------- |
| key → value 쌍 저장   | key만 저장                    |
| 이름으로 값을 저장         | 값 자체의 존재 여부만 확인            |
| `map.put("A", 1)`  | `set.add("A")`             |
| `map.get("A")` → 1 | `set.contains("A")` → true |

→ 🔥 Set = HashMap에서 값(value)을 무시한 형태라고 봐도 됨

✅ 4. 왜 빠를까?
HashMap과 HashSet은 내부적으로 해시 테이블을 사용

key를 hash값으로 바꿔서 → O(1)에 저장/탐색/삭제 가능

```
map.put("Pikachu", 25);  // 해시 계산 후 바로 저장
map.get("Pikachu");      // O(1) 속도로 찾음
```

## 요약 
| 기능   | 코드                                            |
| ---- | --------------------------------------------- |
| 선언   | `Map<String, Integer> map = new HashMap<>();` |
| 추가   | `map.put("A", 1);`                            |
| 조회   | `map.get("A");`                               |
| 존재확인 | `map.containsKey("A");`                       |
| 삭제   | `map.remove("A");`                            |
| 순회   | `for (String key : map.keySet())`             |
