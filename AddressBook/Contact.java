package com.bridgelabz.oops.addressbook;


//Created a pojo class for contact details.

public class Contact {
    // Private variables (Encapsulation)
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    //Zero parameterized constructor.
    public Contact() {

    }

    //parameterized constructor.
    public Contact(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //getter for firstname
    public String getFirstName() {
        return firstName;
    }

    //setter for firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter for lastname
    public String getLastName() {
        return lastName;
    }

    //setter for lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter for address
    public String getAddress() {
        return address;
    }

    //setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    //getter for city
    public String getCity() {
        return city;
    }

    //setter for city
    public void setCity(String city) {
        this.city = city;
    }

    //getter for state
    public String getState() {
        return state;
    }

    //setter for state
    public void setState(String state) {
        this.state = state;
    }

    //getter for Zip
    public int getZip() {
        return zip;
    }

    //setter for Zip
    public void setZip(int zip) {
        this.zip = zip;
    }

    //getter for PhoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter for phonenumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getter for email
    public String getEmail() {
        return email;
    }

    //setter for email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Non-static method of displaying contacts.
    public void displayContact() {

        System.out.println("\nContact Details");
        System.out.println("--------------------");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Address    : " + address);
        System.out.println("City       : " + city);
        System.out.println("State      : " + state);
        System.out.println("Zip        : " + zip);
        System.out.println("Phone      : " + phoneNumber);
        System.out.println("Email      : " + email);
    }
}
