package com.github.hcsp.inheritance;

/**
 * create by crashLab on 2020/06/16.
 **/
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("我的名字是"+ name);
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

}
