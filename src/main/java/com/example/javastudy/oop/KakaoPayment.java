package com.example.javastudy.oop;

public class KakaoPayment implements Payment2{

    @Override
    public void pay() {
        System.out.println("카카오페이 결제");
    }
}
