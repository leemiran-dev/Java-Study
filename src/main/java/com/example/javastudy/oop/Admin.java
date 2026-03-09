package com.example.javastudy.oop;

public class Admin extends User{
    void reviewHistory() {
        System.out.println("히스토리 검토중... (사용 중인 id: "+this.id+")");
    }
}
