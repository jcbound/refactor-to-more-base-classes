package com.github.hcsp.inheritance;

class People extends Animal {
    private int age;
    People(String name, int age) {
        super(name);
        this.age = age;
    }

    void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
