package com.example.myapplication;

public class PasswordGenerator {
    private String firstName;
    private String lastName;
    private String birthday;

    public PasswordGenerator(String first, String last, String birth){
        this.firstName = first;
        this.lastName = last;
        this.birthday = birth;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getBirthday(){
        return this.birthday;
    }
}
