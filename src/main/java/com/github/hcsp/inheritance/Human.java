package com.github.hcsp.inheritance;

public class Human extends Creature {
    protected int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
