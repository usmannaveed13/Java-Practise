package com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
class Person {
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
}



public class Main {

    public static void main(String[] args) {
	// predefined functional interface
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("usman"));
    // class base example
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("usman",32));
        personList.add(new Person("rizwan", 30));
        personList.add(new Person("umer", 23));
        System.out.println(getRequiredPersonLst(personList, (Person p) -> p.getAge() > 30));

    // chaining in functional interface

//    Function<String, Integer> f1 = s -> s.length();
//    Function<String, String> f2  = s -> s + "naveed";
        Function<String, String> empToStringFunction = emp -> emp;

        Function<String, Integer> stringToIntFunction = str -> str.length();
        System.out.println(empToStringFunction.andThen(stringToIntFunction).apply("usman"));
        Function<Integer, Integer> multiply = value -> value * 2;
        Function<Integer, Integer> add      = value -> value + 3;
        System.out.println(multiply.andThen(add).apply(3));
    }

    public static List<Person> getRequiredPersonLst(List<Person> persons, Function<Person, Boolean> fun) {
      List<Person> result = new ArrayList<Person>();
      for (Person person: persons)
          if (fun.apply(person))
              result.add(person);
          return result;

    }
}
