package org.example._02_condition;

public class SwitchExample_02 {
    public static void main (String[] args){
        int num = (int) (Math.random()*6)+1; // 주사위 번호 하나 뽑기
        switch(num) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

                case 3:
                System.out.println("3");
                break;

                case 4:
                System.out.println("4");
                break;

                case 5:
                System.out.println("5");
                break;

                case 6:
                System.out.println("6");
                break;

        }
    }
}
