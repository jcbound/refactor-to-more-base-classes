package com.github.hcsp.inheritance;

/**
 * Copyright: Copyright(c) 2019 iwhalecloud
 * <p>
 * 类说明：TODO
 * <p>
 * 类名称: Human.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/11 21:39
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
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
