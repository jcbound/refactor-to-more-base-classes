package com.github.hcsp.inheritance;

public class Person extends Animal {
    int age;

    Person(String name, int age) {
        super(name);
        this.age = age;
    }

    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
