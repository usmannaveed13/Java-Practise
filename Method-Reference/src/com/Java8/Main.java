package com.Java8;

interface Sayable{
    void say();
}

class MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method");
    }
}
class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is non-static method");
    }
}

public class Main {
    public static void main(String[] args) {
     // static method reference example
	 Sayable sayable = MethodReference::saySomething;
	 sayable.say();

	 // instance method reference example
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        Sayable sayable1 = instanceMethodReference::saySomething;
        sayable1.say();
     // Referring non-static method using anonymous object
        Sayable sayable2 = new InstanceMethodReference()::saySomething;
        sayable2.say();

    }
}
