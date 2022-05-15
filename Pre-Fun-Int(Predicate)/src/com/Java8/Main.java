package com.Java8;

import java.util.function.Predicate;

class Student {
    String name;
    int rolNum;
    int marks;

    public Student(String name, int rolNum, int marks) {
        this.name = name;
        this.rolNum = rolNum;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRolNum() {
        return rolNum;
    }

    public void setRolNum(int rolNum) {
        this.rolNum = rolNum;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rolNum=" + rolNum +
                ", marks=" + marks +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(9));

        Predicate<String> t = i -> i.length() > 5;
        System.out.println(t.test("usmannaveed"));

        // custom class predicate

        Student student = new Student("usman", 15, 50);

        Predicate<Student> s = x -> x.marks > 49;
        System.out.println(s.test(student));

    }
}
