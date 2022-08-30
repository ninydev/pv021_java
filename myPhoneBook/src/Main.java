import MyThreads.MyMainThread;
import fileSerializable.StandartSerializable;


public class Main {
    public static void main(String[] args) {

        MyMainThread work = new MyMainThread();
        work.run();

        System.out.println("\n\n -- Main finish \n -- \n\n");
    }

}