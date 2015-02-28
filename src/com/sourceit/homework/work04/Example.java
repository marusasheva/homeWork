package com.sourceit.homework.work04;


public class Example {

    public static void main(String[] args) {
        Person Bob = new Person("Coach Bob", 27, "M");
        System.out.println(Bob);


        Student Lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(Lynne);

        Teacher Java = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(Java);

        CollegeStudent Ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",
                4.0, 1, "English");
        System.out.println(Ima);

    }
}
