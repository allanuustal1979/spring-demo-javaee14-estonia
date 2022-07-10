package com.sda.javaee14.springdemojavaee14.homework.optional;

import java.util.Optional;

public class OptionalExerciseMain {
    public static void main(String[] args) {

        int nickLenght = personNick() !=null ? personNick().length() :0;
        System.out.println("Nick lenght is:" + nickLenght);

        Optional<String> maybeNick = personNickIfPresent();
        if (maybeNick.isPresent()){
            System.out.println(maybeNick.get());
        } else {
            System.out.println("Sorry, no Nick");
        }

    }

    public static String personNick(){

        return null;
    }
    // Optional is bag for just one item
    // we're using "factory methods" for creating instances of this class
    // factory method - is static method which is able to produce instances of classes and have good name
    public static Optional<String> personNickIfPresent() {
        return Optional.empty();
    }

}
