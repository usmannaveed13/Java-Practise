package com.Java8;

@FunctionalInterface
public interface person {
    int age(int a);
    default String name() {
        return "usman";
    }
    static int id(int i) {
        return i;
    }
}
