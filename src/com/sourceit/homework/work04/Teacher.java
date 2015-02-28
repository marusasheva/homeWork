package com.sourceit.homework.work04;

public class Teacher extends Person
{
    private String Subject;
    private double Salary;

    public Teacher(String name, int age, String gender, String subject, double salary)
    {
        super(name, age, gender);
        Subject = subject;
        Salary = salary;
    }
    public String getSubject()
    {
        return Subject;
    }
    public double getSalary()
    {
        return Salary;
    }
    public void setSubject(String subject)
    {
        Subject = subject;
    }
    public void setSalary(double salary)
    {
        Salary = salary;
    }
    public String toString()
    {
        return super.toString() + "Subject:" + Subject + "Salary:" + Salary;
    }
}