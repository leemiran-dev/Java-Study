package com.example.javastudy.oop;

public class Student1 {
    /* SRP를 어긴 코드 예시
    * Student 클래스가 학생정보관리, 파일저장 두 가지 일(책임)을 가짐
    */
    String name;

    public Student1(String name) {
        this.name = name;
    }

    public void printStudent() {
        System.out.println(name);
    }

    public void savaToFile() {
        System.out.println("파일 저장");
    }
}
