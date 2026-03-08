package com.example.javastudy.controlstatement;

public class IfMethod {
    public static void main(String[] args){
        int x=1, y=1;

        if(equals(x, y)){
            System.out.println("x와 y가 같다.");
        }
    }
    private static boolean equals(int x, int y){
        return x == y;
    }
}
