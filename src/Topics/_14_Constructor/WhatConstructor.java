package Topics._14_Constructor;

import java.util.Scanner;

class Student{
    private int age;
    private String name;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }
}
public class WhatConstructor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=scan.nextLine();
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        Student st=new Student(name,age);
        int stAge=st.getAge();
        String stName=st.getName();
        System.out.println(stName+" "+stAge);
    }
}
