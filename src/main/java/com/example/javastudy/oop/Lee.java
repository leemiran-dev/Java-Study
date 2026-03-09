package com.example.javastudy.oop;

public class Lee implements Student{
    // 인터페이스에 있는 메소드를 다 구현해줘야 함 -> 아님 에러 발생
    @Override
    public void study() {
        System.out.println("Lee is Studying...");
    }
}
