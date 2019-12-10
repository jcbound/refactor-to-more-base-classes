package com.github.hcsp.inheritance;

public class Person extends Biological {
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
