package com.example.KienTrucPhanMem_Tuan07.model;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String personName;
    private int age;

    public Person() {
    }

    public Person(long id, String personName, int age) {
        this.id = id;
        this.personName = personName;
        this.age = age;
    }

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }


    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                '}';
    }
}
