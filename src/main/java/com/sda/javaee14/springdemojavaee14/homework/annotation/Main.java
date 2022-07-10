package com.sda.javaee14.springdemojavaee14.homework.annotation;

public class Main {
    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Allan");
        me.setSurname("Uustal");
        me.setAge(42);

        System.out.println("Me: "+ me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("Allan","Uustal",42);
        System.out.println("another me"+ anotherMe);
        System.out.println("Are those two references refer to the same object?: " + (me == anotherMe));
        System.out.println("is this the same person?: " + me.equals(anotherMe));
        System.out.println();
        System.out.println("are equals: " + me.equals("haha"));
    }
}
