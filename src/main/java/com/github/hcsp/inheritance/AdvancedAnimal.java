package com.github.hcsp.inheritance;

public class AdvancedAnimal extends Animal {
    int age;

    public AdvancedAnimal(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
