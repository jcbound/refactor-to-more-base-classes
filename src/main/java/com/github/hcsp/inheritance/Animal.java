package com.github.hcsp.inheritance;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
    protected void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
