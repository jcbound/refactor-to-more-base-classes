package com.github.hcsp.inheritance;

public class Person extends Animal{
    private int age;
    public Person(String name) {
        super(name);
    }
    public Person(String name ,int age) {
        this(name);
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + super.getName());
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
