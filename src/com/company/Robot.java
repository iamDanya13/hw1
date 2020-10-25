package com.company;

public class Robot implements Run, Jump {


    @Override
    public void jump(Wall wall) {
        wall.isJumped = true;
        System.out.println("Робот прыгнул через стену");

    }

    @Override
    public void run(Treadmill treadmill) {

    }
}



