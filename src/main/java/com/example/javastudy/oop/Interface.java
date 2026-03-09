package com.example.javastudy.oop;

public class Interface {
    public static void main(String[] args) {
        printStudent(new Lee());
        printStudent(new Song());
    }

    // 여기서 Lee lee가 아닌 Student student라고 해서 확장성을 향상
    /*
    * 만약 study()말고 eat()이라는 메소드를 추가하려고 한다면,
    * 각 class에 가서 추가하다가 너무 많은 객체여서 깜빡하고 추가를 못하면 에러가 발생함
    * 이를 대비해 인터페이스에 규칙처럼 정의를 해둔다.
    * */
    public static void printStudent(Student student) {
        student.study();
    }
}
