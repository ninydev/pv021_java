import entities.Contact;

public class MyArray implements Runnable
{
    @Override
    public void run() {

        try {
            simpleArray();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void simpleArray() throws Exception
    {
        Contact val = new Contact("Valentin",  "+38063");
        Contact svet = new Contact("Svetlana", "+38067");

        Contact[] myFriends = new Contact[2];
        myFriends[0] = val;
        myFriends[1] = svet;

        System.out.println("My Friends");
        for(int i = 0; i < 2; i++) {
            System.out.println(myFriends[i]);
        }

        val.setName("Valek");

        System.out.println("My Friends");
        for(int i = 0; i < 2; i++) {
            System.out.println(myFriends[i]);
        }

    }
}
