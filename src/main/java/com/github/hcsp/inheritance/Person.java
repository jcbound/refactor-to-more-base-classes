package com.github.hcsp.inheritance;

public class Person extends Animal {
    private int age;
    public Person(int age, String name) {
        super(name);
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
