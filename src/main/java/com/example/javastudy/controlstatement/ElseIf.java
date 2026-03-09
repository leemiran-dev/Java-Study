package com.example.javastudy.controlstatement;

import java.util.ArrayList;
import java.util.List;

public class ElseIf {
    public static void main(String[] args) {
        List<String> subjectList = new ArrayList<String>();
        subjectList.add("Math");
        subjectList.add("Korean");
        subjectList.add("English");

        if (subjectList.contains("Korean")){
            System.out.println("국어가 포함되어 있음");
        } else if (subjectList.contains("Math")){
            System.out.println("국어가 포함되어 있지 않고 수학이 포함되어 있음");
        } else{
            // 기타 명령
        }
    }
}
