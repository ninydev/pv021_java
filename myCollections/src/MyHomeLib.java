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

    /**
     * Работа с массивами на примере книг и их авторов
     * @throws Exception
     */
    private void work() throws Exception
    {
        Person bul = new Person(" Bulgakov ");

        Book[] books = new Book[2];
        books[0] =  new Book(" Master i Margarita", bul);
        books[1] =  new Book(" Sobache Serdce ", bul);

        print("First ------------", books);
        // Сменили автора
        bul.setName(" Misha Bulgakov");

        print("Change ------------", books);

        // Удалим автора
        bul = null;
        print("Delete (null) ------------", books);

        // Собрали мусор
        System.gc();
        print("GC ------------", books);

        books[0].getAuthor().setName("Afanasevich");
        print("get-set ------------", books);

        bul = books[0].getAuthor();
        bul.setName(" Mich Aff Bul");
        print("get to val - set ------------", books);



    }

    private void print (String msg, Book[] books){
        System.out.println(msg);
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
