package com.ds.usc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private String name;
    private String lastname;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public void setuser()  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name = ");
        setName(input.nextLine());
        System.out.print("Enter lastname = ");
        setLastname(input.nextLine());
        try {

            System.out.print("Enter Age = ");
            setAge(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println ("just Enter numbers");
        }


    }
    public static void CheckUser(User[] users) throws Exception{
        if (users[0].name.equals(users[1].name) && users[0].lastname.equals(users[1].lastname)
                && users[0].age == users[1].age)
            throw new Exception("Repeated");
        else
            System.out.println("not repeated");

    }
}
