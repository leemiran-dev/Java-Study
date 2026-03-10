package com.example.javastudy.oop;

public class CardPayment implements Payment2{
    @Override
    public void pay() {
        System.out.println("카드 결제");
    }
}
