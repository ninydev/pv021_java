import entities.Group;
import entities.User;
import oop.BaseClass;
import oop.ChildrenClass;
import oop.SomeEntity;
import phoneBook.Contact;
import phoneBook.PhoneBook;
import work.MyFirstWork;

public class Main {



    public static void main(String[] args) {

//        // Main.mainClonable(args);
//        Object s= new Contact();
//        //s.hashCode()
//        //s.toString()
//        //s.equals()
//        System.out.println(s.getClass());
//        if (s instanceof Contact )
//            ((Contact) s).setName("Sasha");
//
//        System.out.println(s);
//
//        Object d= new PhoneBook();
//        if (d instanceof Contact )
//            ((Contact) d).setName("Sasha");
//        else {
//            System.out.println("err");
//        }
//
//        try {
//            ((Contact) d).setName("Sasha");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

    }

    public static void mainClonable(String[] args) throws CloneNotSupportedException {

        PhoneBook book = new PhoneBook();

        Contact sasha = new Contact();
        sasha.setName("Sasya");
        sasha.setNumber("+380965747708");

//        book.add(sasha);
//        System.out.println(sasha);
//        book.print();
//
//        sasha = null;
//        System.gc();
//
//        System.out.println(sasha);
//        book.print();


//        Contact p = sasha.clone();
//        p.setName("Person");
//
//        System.out.println(sasha);
//        sasha = null;
//        System.gc();
//        System.out.println(p);

        System.out.println(" Before Method ");
        System.out.println(sasha);

        book.doMe(sasha);

        System.out.println("\n After Method ");
        System.out.println(sasha);

//        int a = 20;
//
//        System.out.println(" Before Method ");
//        System.out.println(a);
//
//        book.doMeInt(a);
//
//        System.out.println("\n After Method ");
//        System.out.println(a);


//        String a = "In Main";
//
//        System.out.println(" Before Method ");
//        System.out.println(a);
//
//        book.doMeString(a);
//
//        System.out.println("\n After Method ");
//        System.out.println(a);


//        book.add(s);
//
//        book.print();

//        SomeEntity p = new SomeEntity("Vasa", 22);
//
//        System.out.println(p);
//
//        p = null;
//        System.gc();
//        System.out.println(p);

//        ChildrenClass c = new ChildrenClass();
//        c.IsIVirtual();
//        BaseClass b = new ChildrenClass();
//        b.IsIVirtual();
//
//        BaseClass d = new BaseClass(2);
//        d.IsIVirtual();

    }

    public static void main1608(String[] args) {

        MyFirstWork work = new MyFirstWork();
        work.DoCalc();

        try {
            work.DoMyCalc();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // work.DoMyCalc();

        try {
            work.DoAnyCalc();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            var arr = ex.getStackTrace();

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].getClassName());
            }
            ex.printStackTrace();
        }
        work.DoAnyCalc();

        System.out.println("End!");

//        Group f12 = new Group("F12", "Rpo", 0, "Vasya");
//        System.out.println(f12);
//
//        Group pv021 = new Group();
//        pv021.setName("Pv021");
//        pv021.setDepartment("Pro");
//        System.out.println(pv021);


        // cout <<
        // System.out.println("Hello world!");

//        User user = new User();
//        // user.Name = "Oleksandr Nykytin";
//        // user.Email = "keeper@ninydev.com";
//        user.setEmail("keeper@ninydev.com");
//        user.setName("Sasha");
//        System.out.println(user);
    }
}