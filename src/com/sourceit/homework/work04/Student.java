package com.sourceit.homework.work04;


public class Student extends Person
{
    private String IdNumber;
    private double GPA;

    public Student(String name, int age, String gender, String id, double gpa)
    {
        super(name, age, gender);
        IdNumber = id;
        GPA = gpa;
    }
    public String getIdNumber()
    {
        return IdNumber;
    }
    public double getGPA()
    {
        return GPA;
    }
    public void setIdNumber(String id)
    {
        IdNumber = id;
    }

    public void setGPA(double gpa)
    {
        GPA = gpa;
    }
    public String toString()
    {
        return super.toString() + ", student id: " + IdNumber + ", gpa: " + GPA;
    }
}
