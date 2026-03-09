package com.example.javastudy.oop;

/* 제네릭
* 클래스, 인터페이스, 메소드에서 사용할 데이터 타입을 외부에서 지정하는 기술
* 즉, 타입을 미리 정하지 않고 나중에 결정하는 것
*/

// Box1: 제네릭 없이 만든 클래스
class Box1 {
    Object item;

    public void setItem(Object item) {
        this.item = item;
    }
    public Object getItem() {
        return item;
    }
}

// Box2: 제네릭 사용
class Box2<T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
public class Generic {
    public static void main(String[] args) {
        // 제네릭 없는 경우
        Box1 box1 = new Box1();
        box1.setItem("JAVA");

        // 형변환 필요 Object 사용하려면 해당하는 타입으로 형변환
        String str = (String) box1.getItem();
        System.out.println(str);

        // 제네릭 활용
        Box2<String> box2 = new Box2();
        box2.setItem("JAVA");

        String str2 = box2.getItem();
        System.out.println(str2);

    }
}
