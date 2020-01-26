package com.example.myapplication;

public class AccountGenerator {
    private String firstName;
    private String lastName;
    private String birthday;

    //store all input in object
    public AccountGenerator(String first, String last, String birth){
        this.firstName = first;
        this.lastName = last;
        this.birthday = birth;
    }

    //get methods for debugging
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getBirthday(){
        return this.birthday;
    }

    //generates username
    public String generateUsername(){
        char firstInitial = this.firstName.charAt(0);
        String lastName = this.lastName;
        String day = birthday.substring(3,5);

        String password = firstInitial + lastName + day;
        password = password.toLowerCase();
        return password;
    }

    //generates password
    public String generatePassword(){
        String firstInitial = this.firstName.substring(0,1);
        String lastLetter = this.firstName.substring(this.firstName.length()-1);
        String month = this.birthday.substring(0,2);
        String year = this.birthday.substring(8);
        String last = this.lastName.substring(0,3);
        int firstLength = this.firstName.length();
        int lastLength = this.lastName.length();

        String password = firstInitial + lastLetter + month + year + last + firstLength + lastLength;
        password = password.toLowerCase();
        return password;
    }
}
