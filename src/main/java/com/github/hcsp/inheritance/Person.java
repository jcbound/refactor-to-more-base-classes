package com.github.hcsp.inheritance;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

    void sayGender(String gender) {
        System.out.println("我是一个" + gender);
    }

}
