package com.techreturners.exercise002;

public class Person {
    
    private String firstName;
    private String secondName;
    private String address;
    private int age;

    public Person(String firstname, String secondName, String address, int age) {
        this.firstName = firstname;
        this.secondName = secondName;
        this.address = address;
        this.age = age;
    }
    public String getFirstName() { return firstName;  }

    public String getSecondName() { return secondName; }

    public String getAddress() {
        return address;
    }

    public int getAge(){ return age;}

}
