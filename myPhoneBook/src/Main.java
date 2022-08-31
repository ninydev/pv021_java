
import MyThreads.MyExchanger.WorkExchanger;
import MyThreads.MySemaphore.MySemaphoreWork;
import MyThreads.MyWaitNotify.WorkWait;



public class Main {
    public static void main(String[] args) {

        WorkExchanger work = new WorkExchanger();
        work.run();

        System.out.println("\n\n -- Main finish \n -- \n\n");
    }

}