# 6월 1일 til

## 객체 배열 정렬과 comparator
### Arrays.sort(배열) 기본 정렬
- int [], String[] 같은 기본형 배열은 Arrays.sort()만으로 정렬 가능
- Arrays.sort(numbers); -> 오름차순 정렬됨

### 객체배열을 정렬하려면? 
```
Arrays.sort(객체배열, new Comparator<타입>(){
    @Override
    public int compare(타입 o1, 타입 o2){
     //정렬 기준 정의 
    }
})
```
-> 이 방식은 직접 정렬 기준을 정할 수 있다. 

### @Override란?
- 부모 클래스(혹은 인터페이스)의 메서드를 재정의한다는 표시
- 여기서는 Comparator 인터페이스의 compare 메서드를 구현하고 있다는 걸 컴파일러에게 명시
- 오타나 시그니처 오류 방지에 도움됨

| 상황                         | 정렬 방법                         |
| -------------------------- | ----------------------------- |
| 기본형 배열 (int\[], String\[]) | `Arrays.sort(배열)`             |
| 객체 배열                      | `Arrays.sort(배열, Comparator)` |
| 정렬 기준 직접 설정                | `compare()` 메서드 오버라이드 필요      |

## Hash set 
 - 중복 허용하지 않는다. 
 - 상태 추적시 용이 ! 
Set<String> company = new HashSet<>();
```
company.add("Alice");
company.remove("Alice");
```

## 문자열 비교 

- Java에서 문자열은 객체이므로 ==은 주소 비교이다. (참조값 비교)
- 값이 같은지 비교하려면 반드시 .equals() 사용

## 문자열 일부 뒤집기 
```
String p1 = new StringBuilder(word.substring(0, i)).reverse().toString();
```
| 코드                                 | 설명                                       |
| ---------------------------------- | ---------------------------------------- |
| `word.substring(0, i)`             | 문자열 `word`의 **0부터 i-1까지** 자름 (부분 문자열 추출) |
| `new StringBuilder(...).reverse()` | 추출한 문자열을 **뒤집음**                         |
| `.toString()`                      | 뒤집은 결과를 다시 **문자열로 변환**                   |


