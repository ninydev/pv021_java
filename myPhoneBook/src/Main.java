
import MyThreads.MySemaphore.MySemaphoreWork;
import MyThreads.MyWaitNotify.WorkWait;



public class Main {
    public static void main(String[] args) {

        MySemaphoreWork work = new MySemaphoreWork();
        work.run();

        System.out.println("\n\n -- Main finish \n -- \n\n");
    }

}