package com.example.javastudy.controlstatement;

public class SwitchEnum {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;

        switch(fruit){
            case APPLE: {
                System.out.println("사과입니다.");
                break;
            }
            case BANANA:{
                System.out.println("바나나입니다.");
                break;
            }
            default: {
                System.out.println("아무것도 아닙니다.");
                break;
            }
        }
    }
}
