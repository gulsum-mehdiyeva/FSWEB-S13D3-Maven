package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person1=new Person("John", "Doe", 20);
        Person person2=new Person("Anjelina", "Jolie", 12);
        Person person3=new Person("Dua", "Lipa", 18);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Firstname: " + person3.getFirstName());
        System.out.println("LastName: " + person3.getLastName());
        System.out.println("Age: " + person3.getAge());
    }
}
