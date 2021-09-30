package com.github.hcsp.inheritance;

public class Boy extends Person{

    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        super.sayGender("男孩");
    }
}
