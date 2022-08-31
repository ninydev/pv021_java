package MyThreads.MySemaphore;

import java.util.concurrent.Semaphore;

public class MySemaphoreWork implements Runnable{

    @Override
    public void run() {

        Semaphore semaphore = new Semaphore(256);

        for(int i = 1 ; i < 520; i ++) {
            new Thread( new MyTrain(semaphore)).start();
        }


    }
}
