package com.library.models;
import com.library.enums.Role;

public abstract class Person {
    private int id;
    private String name;
    private Role role;

    public Person(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
