package com.bridgelabz.oops.addressbook;
import java.util.*;

import java.util.ArrayList;

public class ContactService {
    Scanner sc=new Scanner(System.in);

    //created an arraylist to store the contact details
    ArrayList<Contact> list=new ArrayList<>();

    //AddContact funtionality to add the contact into the list
    public void AddContact(){

        Contact c=new Contact();
        System.out.println("Enter First Name:");
        c.setFirstName(sc.nextLine());
        System.out.println("Enter last Name:");
        c.setLastName(sc.nextLine());
        System.out.println("Enter Address:");
        c.setAddress(sc.nextLine());
        System.out.println("Enter city:");
        c.setCity(sc.nextLine());
        System.out.println("Enter State:");
        c.setState(sc.nextLine());
        System.out.println("Enter Zip:");
        c.setZip(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Phone Number:");
        c.setPhoneNumber(sc.next());
        sc.nextLine();
        System.out.println("Enter Email:");
        c.setEmail(sc.nextLine());
        list.add(c);
        System.out.println("Contact Added");
    }


    //Editing Contact method based on the first name provided by the user.
    public void editContact(){
        System.out.println("Enter the firstname to edit");
        String key=sc.next();
        sc.nextLine();
        boolean flag=false;
        for(Contact c:list){
            if(c.getFirstName().equalsIgnoreCase(key)){
                flag=true;
                System.out.println("Enter new Address:");
                c.setAddress(sc.nextLine());
                System.out.println("Enter new city:");
                c.setCity(sc.nextLine());
                System.out.println("Enter new State:");
                c.setState(sc.nextLine());
                System.out.println("Enter new Zip:");
                c.setZip(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter new Phone Number:");
                c.setPhoneNumber(sc.next());
                sc.nextLine();
                sc.nextLine();
                System.out.println("Enter new Email:");
                c.setEmail(sc.nextLine());
                break;
            }
        }
        if(flag==false){
            System.out.println("Contact not found");
        }
    }

    //delete contact by matching the first name provided by the user.
    public void deleteContact(){
        System.out.println("Enter the firstname to delete contact");
        String key=sc.next();
        Contact delete=null;
        for(Contact c:list) {
            if (c.getFirstName().equalsIgnoreCase(key)) {
                    delete=c;
                    break;
            }
        }
        if(delete!=null){
            list.remove(delete);
            System.out.println("Contact deleted.");

        }
        else{
            System.out.println("Contact not found");
        }
    }

    //Displaying the existing contacts.
    public void displayContacts(){
        if(list.isEmpty()){
            System.out.println("No contacts are added list is empty");
        }
        else{
            for(Contact c:list){
                c.displayContact();
            }
        }
    }


}
