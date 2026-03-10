package com.example.javastudy.oop;

public class Computer2 {
    // DIP 지킨 코드 예시: 구체적인 클래스가 아닌 인터페이스에 의존
    Keyboard2 keyboard;

    Computer2(Keyboard2 keyboard){
        this.keyboard = keyboard;
    }

    void use() {
        keyboard.type();
    }
}
