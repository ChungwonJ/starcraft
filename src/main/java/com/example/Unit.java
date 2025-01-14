package com.example;

import java.util.Random;

public class Unit {
    private String name;
    private int hp;
    private int damage;
    private String derention;
    private int position;

    public Unit(String name, int hp,int damage, String derention){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.derention = derention;
        this.position = new Random().nextInt(20);
    }

    public void printUnitInfo (){
        System.out.println(name + "| 체력: " + hp + " | 공격력: " + damage + " | 설명: " + derention );
    }


//- 클래스에 유닛을 움직일 수 있는 move 메소드 생성하기
//- 왼쪽으로 움직일건지 오른쪽으로 움직일건지 파라미터로 입력
//- 왼쪽의 경우 각 유닛의 위치에 -1을, 오른쪽이면 +1을 해주기
//- 1부터 20까지의 정수 중에 랜덤한 수를 받고, 왼쪽 오른쪽도 랜덤하게 받은 후 for 문을 통해 조건에 맞게 이동하기
//- 유닛의 현재 위치를 출력하는 메서드 만들기

public void Move(String moving){
        switch (moving) {
        case "Left" :
            position--;
            break;
        case "Right" :
            position++;
            break;
    }
    System.out.println(name + "이 " + position + "으로 이동했습니다." + moving);
}
//- 각 유닛의 위치를 지정할 수 있는 필드(Int)와, Setter 만들기
    public int getPosition(){
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


}
