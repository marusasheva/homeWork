package com.sourceit.homework.work04;


public class Person {

    private String Name;
    private int Age;
    private String Gender;

    public Person(String name, int age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String toString() {
        return Name + "age:" + Age + ", gender: " + Gender;
    }
}
