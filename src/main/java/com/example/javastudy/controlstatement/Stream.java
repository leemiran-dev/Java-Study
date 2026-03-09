package com.example.javastudy.controlstatement;

import java.util.Arrays;
import java.util.List;

/*
Stream API
- 원본 데이터 변경 안됨 (only Read)
- 새 리스트로 만들려면 stream을 통해 새로 생성
- 한번 stream을 사용하면 끝! (다시 사용하면 에러남)
 */
public class Stream {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "green"};

        Arrays.stream(colors).forEach(System.out::println);
        // 재사용 불가하므로, 새 리스트 생성
        // List<String> colors2 = Arrays.stream(colors).toList();

        // 문제: yellow를 제거하고 각 컬러에 new를 앞에 추가해서 출력할 것.
        Arrays.stream(colors)
                .filter(color -> !color.equals("yellow"))
                .map(color -> "new "+color)
                .forEach(System.out::println);

    }
}
