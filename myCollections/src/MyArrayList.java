import entities.Contact;
import entities.Person;

import java.util.ArrayList;

public class MyArrayList implements Runnable
{
    @Override
    public void run() {
        try {
            work();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void work() throws Exception
    {
        ArrayList<Contact> myPhoneBook = new ArrayList<>();

        Contact val = new Contact("Valentin",  "+38063");
        Contact svet = new Contact("Svetlana", "+38067");

        myPhoneBook.add(val);
        myPhoneBook.add(svet);

        print(myPhoneBook);

        val.setName("Valek");
        svet.setName("Svetka");

        print(myPhoneBook);

    }

    private  void print (ArrayList<Contact> myPhoneBook ) {
        for (Contact p: myPhoneBook)
        {
            System.out.println(p);
        }
    }
}
