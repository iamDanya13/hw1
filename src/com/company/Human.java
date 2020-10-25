package com.company;

public class Human implements Run, Jump {

    @Override
    public void jump(Wall wall) {
        wall.isJumped = true;
        System.out.println("Человек перепрыгнул стену");

    }

    @Override
    public void run(Treadmill treadmill) {

    }
}
