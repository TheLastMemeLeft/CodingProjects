package ui.Person;

import javax.swing.*;

public class Person
{
    private String firstName;
    private String lastName;
    private String gender;
    private String nameString = firstName + " " + lastName+" is a "+gender;
    private String address;
    private String phone;
    private String info="address is "+address+", and phone is "+phone;


    public Person(String firstName, String lastName, String gender, String address, String phone)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }
    public String toString() {
        return firstName + " " + lastName ;
    }

    public void printName()
{
    System.out.println(nameString);
}
    public void printInfo()
    {
        System.out.println(info);
    }

}