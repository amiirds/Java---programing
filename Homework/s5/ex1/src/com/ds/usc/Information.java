package com.ds.usc;

public class Information {
    private String username;
    private String name;
    private String password;
    private int age;
    private String address;
    private long phone_number;
    private String education_rate;


    public String getUsername() {
        return username;
    }

    public Information setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public Information setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Information setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Information setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Information setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public Information setPhone_number(long phone_number) {
        this.phone_number = phone_number;
        return this;
    }

    public String getEducation_rate() {
        return education_rate;
    }

    public Information setEducation_rate(String education_rate) {
        this.education_rate = education_rate;
        return this;
    }
}
