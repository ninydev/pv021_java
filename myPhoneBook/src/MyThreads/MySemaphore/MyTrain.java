package MyThreads.MySemaphore;

import java.util.concurrent.Semaphore;

public class MyTrain implements Runnable {

    Semaphore sem;

    public MyTrain(Semaphore sem){
        this.sem = sem;
    }

    @Override
    public void run() {

        try {
            System.out.printf(" Поезд прибыл к семафору %s \n", Thread.currentThread().getName());
            sem.acquire(); // Жду разрешения
            System.out.printf("++ Поезд получил разрешение ехать %s \n", Thread.currentThread().getName());
            move();
            System.out.printf("-- Поезд проехал %s \n", Thread.currentThread().getName());
            sem.release(); // Сообщаю, что я проехал
        } catch (Exception e) {
            // throw new RuntimeException(e);
        }
    }


    public void move(){
        for (int i = 1; i < 5; i++){
            // System.out.printf(" Поехал поезд %s \n", Thread.currentThread().getName());
            try{Thread.sleep(10);}
            catch(InterruptedException e){}
        }
    }
}
