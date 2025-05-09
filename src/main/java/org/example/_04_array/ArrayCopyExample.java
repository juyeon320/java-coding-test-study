package org.example._04_array;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStringArray = {"java","array","copy"};
        String[] newStringArray = new String[5];

        System.arraycopy(oldStringArray,0,newStringArray,0, oldStringArray.length);

        for(int i = 0; i < newStringArray.length; i++){
            System.out.print(newStringArray[i] + ",");
        }
    }
}
