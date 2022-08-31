package MyThreads.MyExchanger;

import java.util.concurrent.Exchanger;

public class WorkExchanger implements Runnable {

    @Override
    public void run() {
        Exchanger<String> ex = new Exchanger<String>();
        new Thread(new PutThread(ex, "1")).start();
        new Thread(new GetThread(ex,"2")).start();
        new Thread(new PutThread(ex,"3")).start();
        new Thread(new GetThread(ex,"4")).start();
        new Thread(new PutThread(ex, "5")).start();
        new Thread(new GetThread(ex, "6")).start();
        new Thread(new PutThread(ex, "7")).start();

        try {
            System.out.println("\n In Exit: " +  ex.exchange("End"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //new Thread(new GetThread(ex)).start();
    }
}
