package org.example.Head01_javaProgrammingStart;

public class ConditionExample {
    public static void main(String[] args) {
        int num = 2;

        if (num % 2 == 0) {
            System.out.println(("짝수"));
        } else {
            System.out.println("홀수");
        }

        switch (num) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
        }
    }
}
