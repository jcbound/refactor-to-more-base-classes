package com.github.hcsp.inheritance;

/**
 * create by crashLab on 2020/06/16.
 **/
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
