package com.Java8;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    public static void main(String[] args) {
   // this is for functional interface with out implement using in main class
	person p = (int a) -> a;
	System.out.println(p.age(32));
    System.out.println(p.name());
    System.out.println(person.id(1));

    // this part of class that implement the functional interface
    test t = new test();
    System.out.println(t.name());
    System.out.println(t.age(2));
    System.out.println(person.id(2));
    }
}
