package com.example.javastudy.oop;

import java.util.*;

/* 컬렉션
* 데이터 타입으로는 객체만 가능해서 primitive type은 사용 불가
* 제네릭 형태로 구현되어 있어서 다양한 형태로 활용 가능
*/

public class Collection {
    public static void main(String[] args) {
        // 리스트: 데이터를 순서에 따라 저장하는 자료구조
        List<Integer> numList = new ArrayList<Integer>();

        numList.add(1);
        numList.add(2);

        System.out.println(numList.get(1)); // 1번째 인덱스에 있는 값 출력

        // 셋: 중복이 허용되지 않게 데이터를 저장하는 자료구조
        Set<Integer> numSet = new HashSet<Integer>();

        numSet.add(1);
        numSet.add(2);
        numSet.add(3);
        numSet.add(2);

        System.out.println(numSet.size()); // 중복을 허용하지 않으므로 3

        // 맵: key, value 쌍으로 데이터 관리하는 자료구조
        Map<String, Integer> map = new HashMap<>();

        // 맵에 데이터를 넣을 때는 put 사용
        map.put("Lee", 20);
        map.put("Song", 19);

        System.out.println(map.get("Lee")); // 20
        System.out.println(map.get("Park")); // null
        System.out.println(map.getOrDefault("Kim", 30)); // 해당 키가 없으면 30 출력
        System.out.println(map.get("Kim")); // null, 30이 들어간 건 아님

        // 큐: 데이터 FIFO 방식으로 관리하는 자료구조
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);

        // poll: 큐에서 하나씩 꺼내기
        System.out.println(queue.poll()); // 11
        System.out.println(queue.poll()); // 12
        System.out.println(queue.poll()); // 13
        System.out.println(queue.poll()); // 14

        // 스택: 데이터 LIFO 방식으로 관리하는 자료구조
        Stack<Integer> stack = new Stack<>();

        stack.add(21);
        stack.add(22);
        stack.add(23);
        stack.add(24);

        // pop: 스택에서 하나씩 꺼내기
        System.out.println(stack.pop()); // 24
        System.out.println(stack.pop()); // 23
        System.out.println(stack.pop()); // 22
        System.out.println(stack.pop()); // 21

    }
}
