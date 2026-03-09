package com.example.javastudy.oop;

public class Polymorphism {
    public static void main(String[] args) {
        KoreanChef lee = new KoreanChef();

        printCookInfo(lee);
    }

    public static void printCookInfo(Chef chef){
        if (chef instanceof KoreanChef){
            System.out.println("한식 요리중...");
        }
        else if (chef instanceof ChineseChef){
            System.out.println("중식 요리중...");
        }
    }
}
