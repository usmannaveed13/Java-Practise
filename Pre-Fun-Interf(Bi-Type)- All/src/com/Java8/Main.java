package com.Java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
	// Bi Predefined Functional Interface in Java 8
    // BiPredicate
       BiPredicate<Integer,Integer> bp = (i, j)->(i+j) %2==0;
       System.out.println(bp.test(24,34));
    // BiFunction
       BiFunction<Integer,Integer,Integer> bf = Integer::sum;
       System.out.println(bf.apply(2,2));

        //BiConsumer
        BiConsumer<String,String> bc = (s1, s2)->System.out.println(s1+s2);
        bc.accept("Bi","Consumer");

    }

}
