package com.github.hcsp.inheritance;

public class Dog  extends Animal {

    Dog(String name) {
        this.name = name;
    }

    public void wang() {
        System.out.println("汪");
    }
}
