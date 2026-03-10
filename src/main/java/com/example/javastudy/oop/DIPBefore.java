package com.example.javastudy.oop;

// DIP 위반 코드 예시
class Keyboard {
    void type() {
        System.out.println("Typing...");
    }
}

// Computer 클래스가 Keyboard에 직접 의존
class Computer {
    Keyboard keyboard = new Keyboard();

    void use() {
        keyboard.type();
    }
}
