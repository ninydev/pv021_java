import entities.Group;
import entities.User;

public class Main {
    public static void main(String[] args) {

        Group f12 = new Group("F12", "Rpo", 0, "Vasya");
        System.out.println(f12);

        Group pv021 = new Group();
        pv021.setName("Pv021");
        pv021.setDepartment("Pro");
        System.out.println(pv021);


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