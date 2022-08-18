import entities.Book;
import entities.Person;

public class MyHomeLib implements Runnable {


    @Override
    public void run() {
        try {
            work();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void work() throws Exception
    {
        Person bul = new Person(" Bulgakov ");

        Book[] books = new Book[2];
        books[0] =  new Book(" Master i Margarita", bul);
        books[1] =  new Book(" Sobache Serdce ", bul);

        System.out.println("My books");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }



    }
}
