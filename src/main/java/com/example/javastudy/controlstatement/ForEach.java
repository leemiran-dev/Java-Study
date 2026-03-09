package com.example.javastudy.controlstatement;

public class ForEach {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "green"};

        for(String color: colors){
            System.out.println("This color is "+ color);
        }
    }
}
