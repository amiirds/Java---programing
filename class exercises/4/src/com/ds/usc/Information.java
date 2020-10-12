package com.ds.usc;

import java.util.Scanner;

public class Information {
     private String Name;
     private String Lastname;
    private String job;
    private int Age;
     private String Username;
     private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = "amir";
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = "1234";
    }
    public void Setuser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name = ");
        setName(input.nextLine());
        System.out.print("Enter lastname = ");
        setLastname(input.nextLine());
        System.out.print("Enter your age = ");
        setAge(input.nextInt());
        System.out.print("Enter job = ");
        setJob(input.next());
    }
}
