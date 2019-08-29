package com.github.hcsp.inheritance;

public class Father extends Animal{
    int age;

    public Father(String name,int age){
        super(name);
        this.age=age;
    }

    public void sayMyAge(){
        System.out.println("我的年龄是"+ age);
    }

}
