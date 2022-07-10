package com.sda.javaee14.springdemojavaee14.homework.annotation;

import java.util.HashSet;
import java.util.Set;

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
        Person meAgain = new Person("Allan", "Uustal", 42);
        //builder is better than all args constructor - because you can see more
        Person meAgainWithBuilder = Person.builder()
                .age(42)
                .name("Allan")
                .surname("Uustal")
                .build();
        // Set doesn't store duplications
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();
        uniquePersons.add(me);
        uniquePersons.add(anotherMe); // me will be replaced with anotherMe
        System.out.println("set size, after adding two equal Persons: " + uniquePersons.size());
    }
}
