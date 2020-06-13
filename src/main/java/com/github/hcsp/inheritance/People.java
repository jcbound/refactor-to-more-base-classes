package com.github.hcsp.inheritance;

public class People extends Live {
    protected int age;

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
