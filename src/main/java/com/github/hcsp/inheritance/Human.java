package com.github.hcsp.inheritance;

/**
 * creat by nickless
 *
 * @Date 2020/2/17 19:43
 */
public class Human extends Animal {
    protected int age;

    public Human(String name, int age) {
        super(name);
        this.age = age;
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
