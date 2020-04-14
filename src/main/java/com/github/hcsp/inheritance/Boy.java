package com.github.hcsp.inheritance;

public class Boy extends Person {
    public Boy(String name, int age) {
       super(age, name);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}
