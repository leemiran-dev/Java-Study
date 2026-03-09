package com.example.javastudy.controlstatement;

public class DoWhile {
    public static void main(String[] args) {
        int year = 2019;

        do {
            year++;
            if (year%2==0){
                continue;
            }
            System.out.println("홀수 연도 입니다. " + year);
        }while(year < 2027);
    }
}
