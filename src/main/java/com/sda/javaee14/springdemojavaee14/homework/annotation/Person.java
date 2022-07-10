package com.sda.javaee14.springdemojavaee14.homework.annotation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generates all getters and setters, toString(), equals(), hashCode()
@AllArgsConstructor // generates constructors for all fields in order of their decalaration
@NoArgsConstructor // generates default constructors
@Builder

public class Person {

    private String name;

    private String surname;

    private int age;

}
