package com.company;

public class Cat implements Jump, Run  {


    @Override
    public void jump(Wall wall) {

        wall.isJumped = true;
        System.out.println("Кот прыгнул через стену");

    }

    @Override
    public void run(Treadmill treadmill) {
        treadmill.isRun = true;

    }
}
