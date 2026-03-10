package com.example.javastudy.oop;


public class OCP {
    public static void main(String[] args) {
        // OCP 어긴 코드 예시
        Payment1 payment1 = new Payment1();
        payment1.pay("card");

        // OCP 지킨 코드 예시
        Payment2 payment2 = new CardPayment();
        payment2.pay();
    }
}
