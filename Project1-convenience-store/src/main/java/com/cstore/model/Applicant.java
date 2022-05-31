package com.cstore.model;

import com.cstore.storeEnums.Qualification;

public class Applicant {
    private String id;
    private String name;
    private int age;
    private Qualification qualification;

    public Applicant(String id, String name, int age, Qualification qualification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", degreeType='" + qualification + '\'' +
                '}';
    }
}
