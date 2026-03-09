package com.example.javastudy.oop;

public class Polymorphism {
    public static void main(String[] args) {
        ChineseChef song = new ChineseChef();

        printCookInfo(song);
    }

    public static void printCookInfo(Chef chef){
       // 수정 전에는 새로운 셰프가 추가되면 관련된 파일에 else if 등 조건문을 추가해줘야 함
        chef.printCookInfo();
    }
}
