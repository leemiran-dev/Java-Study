package com.example.javastudy.oop;

import java.util.List;

public class Admin extends User{
    // 오버라이딩 -> User 부모 클래스의 setId와 별개
    @Override
    void setId(String param) {
        this.id = param;
        System.out.println("admin ID 설정 되었습니다");
    }

    void reviewHistory() {
        System.out.println("히스토리 검토중... (사용 중인 id: "+this.id+")");
    }

    // 오버로딩
    void reviewHistory(List<String> logs) {
        System.out.println("히스토리(로그) 검토중...");
    }
}
