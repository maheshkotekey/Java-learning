package com.hp.learning.personalinfo.dto;

public class person {


private String firstname;
private String lastname;
private String fullname;
    private int age;



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(Character.isUpperCase(firstname.charAt(0))){
            this.firstname = firstname;
        }
       else{
            System.out.println("First name is Invalid");
        }
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        if(Character.isUpperCase(lastname.charAt(0))) {
            this.lastname = lastname;
        }
        else{
            System.out.println("Invalid Last Name");
        }
    }

    public String getFullname() {
        return firstname + " " +lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

        if(age > 0){

            this.age = age;
        }
        else{
            System.out.println("We cannot be set negative age value");
        }
    }

    public String human(int age){

        return "age";


    }

  
}
