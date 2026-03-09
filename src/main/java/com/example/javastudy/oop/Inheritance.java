package com.example.javastudy.oop;

/*
* 상속
* : 자바의 모든 클래스는 Object 클래스를 상속 받음
*/
public class Inheritance {
    public static void main(String[] args) {
        Admin admin1 = new Admin();

        /* IS-A 관계
        : 자식 클래스 객체는 부모 클래스 자료형처럼 사용 가능
        큰 범위 = 작은 범위
        User user1 = new Admin(); // 가능
        Admin admin2 = new User(); // 불가
        */

        // Admin 클래스에 변수나 메소드를 정의하지 않아도 가능함 (상속)
        admin1.setId("admin_1");
        System.out.println(admin1.id);
        admin1.reviewHistory();
    }
}
