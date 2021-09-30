package com.github.hcsp.inheritance;

public class Girl extends Person{

    public Girl(String name, int age) {
        super(name, age);
    }

    public void sayGirl() {
        super.sayGender("女孩");
    }
}
