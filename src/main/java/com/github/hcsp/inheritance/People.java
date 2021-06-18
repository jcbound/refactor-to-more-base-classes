package com.github.hcsp.inheritance;

public class People extends Animal{
    protected int age;

    public People(String name, int age) {
        super(name);
        this.age = age;
    }

    protected void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}
