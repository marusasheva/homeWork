package com.sourceit.homework.work04;


public class CollegeStudent extends Student
{
    private int Year;
    private String Major;

    public CollegeStudent(String name,int age,String gender,String id, double gpa,    int year, String major)
    {
        super(name, age, gender, id, gpa);
        Major = major;
        Year = year;
    }
    public String getMajor()
    {
        return Major;
    }
    public int getYear()
    {
        return Year;
    }
    public void setMajor(String major)
    {
        Major = major;
    }
    public void setYear(int year)
    {
                Year = year;
    }
    public String toString()
    {
        return super.toString() + "Year:" + Year + "Major:" + Major;
    }
}
