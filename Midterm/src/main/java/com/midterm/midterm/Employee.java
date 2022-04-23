package com.midterm.midterm;

public class Employee {
    private String firstname;
    private String lastname;
    private int salary;
    private int age;

    public Employee(String firstname, String lastname, int salary, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
