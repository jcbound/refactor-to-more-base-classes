package com.github.hcsp.inheritance;

/**
 * 目前代码中似乎不需要 Animal 作为中间类
 * 但增加这一层可能会方便以后拓展
 */
public class Animal extends Biology {
    public Animal(String name) {
        super(name);
    }
}
