package org.example.Head03_OOP.example12;

public class EnumBasicTest {
    public enum  Level {
        LOW, MEDIUM, HIGHT
    }

    public static void main(String[] args) {
        for (Level lv1 : Level.values()) {
            System.out.println(lv1 + " ordinal=" + lv1.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name():" + today.name());
    }
}
