package com.example.javastudy.oop;

public class Payment1 {
    // OCP를 어긴 코드 예시: 매번 결제 방식이 추가될 때마다 조건을 계속 추가해야함
    public void pay(String type) {
        if(type.equals("card")) {
            System.out.println("카드 결제");
        } else if (type.equals("kakao")){
            System.out.println("카카오페이 결제");
        }
    }
}
