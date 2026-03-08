package com.example.javastudy.controlstatement;

public class If {

    public static void main(String[] args){
        compare(2,3);
        compare(3,2);
        compare2(1,3);
    }

    public static void compare(int x, int y) {
        if (x<y) {
            System.out.println("x가 y보다 작다.");
        } else {
            System.out.println("x가 y보다 크거나 같다.");
        }
    }

    public static void compare2(int x, int y){
        /* &&: AND
         * ||: OR
         * !: NOT
         */
        if (x==1 || y==2){
            System.out.println("x가 1이거나 y가 2입니다.");
        }
    }
}
