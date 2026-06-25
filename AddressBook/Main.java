package com.bridgelabz.oops.addressbook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContactService cs = new ContactService();

        System.out.println("Welcome to Address Book Program");

        int ch;

        do{
            System.out.println("\n===== Address Book Menu =====");
            System.out.println("1. Add Contact");
            System.out.println("1. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cs.AddContact();
                    break;

                case 2:
                    cs.displayContacts();
                    break;

                case 3:
                    cs.editContact();
                    break;
                case 4:
                    cs.deleteContact();
                    break;

                case 5:
                    System.out.println("Thank you. Have a nice day");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (ch!=5);
    }
}