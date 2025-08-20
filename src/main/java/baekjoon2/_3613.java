package baekjoon2;

import java.util.Scanner;

public class _3613 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        if (isJava(s)){
            System.out.println(toCpp(s));
        }
        else if (isCPP(s)){
            System.out.println(toJava(s));
        }
        else {
            System.out.println("Error!");
        }
    }
    static boolean isJava(String s) {
        //비어있거나, 첫글자가 소문자가 아닌 경우 false 반환
        if (s.isEmpty() || !Character.isLowerCase(s.charAt(0)))
            return false;
        if (s.contains("_"))
            return false;
        return true;
    }
    static boolean isCPP(String s){
        if (s.isEmpty() || s.charAt(0) == '_' || s.charAt(s.length()-1) == '_')
            return false;
        //언더바가 연속되면 안됨.
        if (s.contains("__"))
            return false;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                return false;
        }
        return true;
    }

    static String toCpp(String s) {
        StringBuilder sb = new StringBuilder();
        // 변수명을 문자 하나씩 확인
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c)) // 대문자 나오면 _ ->append
                sb.append("_").append(Character.toLowerCase(c));
            else
                sb.append(c); //소문자느 ㄴ그대로 추가
        }
        return sb.toString();
    }
    static String toJava(String s) {
        StringBuilder sb = new StringBuilder();
        boolean upper = false; // upper boolean ㅅㅓㄴㅇㅓㄴ
        for (char c : s.toCharArray()){
            if (c=='_'){
                upper = true; //대문자로 반환해야함
            } else {
                if (upper){
                    //바로앞에 _가 있었으면 대문자로 변환
                    sb.append(Character.toUpperCase(c));
                    upper = false;
                } else {
                    sb.append(c); //아니면 그대로 추가
                }
            }
        }
        return sb.toString();
    }
}
