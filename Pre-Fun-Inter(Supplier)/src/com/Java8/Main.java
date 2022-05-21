package com.Java8;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	// predefined functional interface Supplier
        Supplier<String> s = () -> "usman";
        System.out.println(s.get());

    }
}
