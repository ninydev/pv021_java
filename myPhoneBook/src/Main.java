
import MyThreads.MyWaitNotify.WorkWait;



public class Main {
    public static void main(String[] args) {

        WorkWait work = new WorkWait();
        work.run();

        System.out.println("\n\n -- Main finish \n -- \n\n");
    }

}