package com.example.javastudy.oop;

public class DIPAfter {
    public static void main(String[] args) {
        Keyboard2 keyboard = new BasicKeyboard();
        Computer2 computer = new Computer2(keyboard);

        computer.use();
    }
}
