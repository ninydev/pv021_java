package phoneBook;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class PhoneBook {
    ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<Contact>();
    }

    public void doMe (@NotNull Contact s){
        s.setName("in PhoneBook");
        System.out.println("\n In Method ");
        System.out.println(s);
    }

    public void doMeInt( int a){
        a = 10;
        System.out.println("\n In Method ");
        System.out.println(a);
    }
    public void doMeString( String a){
        a = "In method";
        System.out.println("\n In Method ");
        System.out.println(a);
    }


    public void add (Contact c){
        contacts.add(c);
    }

    public void print() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

}
