package com.example.javastudy.oop;

public class SRP {
    // SRP 지킨 코드 예시
    public static void main(String[] args) {
        Student2 student = new Student2("Lee");

        student.printStudent();

        FileManager fm = new FileManager();
        fm.save(student);
    }
}
