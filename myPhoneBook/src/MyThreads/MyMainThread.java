package MyThreads;

public class MyMainThread implements Runnable
{
    @Override
    public void run() {
        Thread.currentThread().setName("Главный поток");
        // thisThread();
        runOtherThread();
    }

    void runOtherThread(){
        MyFirstThread t1 = new MyFirstThread("жив");
        MyFirstThread t2 = new MyFirstThread("мертв");

        t1.start();
        t2.start();
        try {
            // Главный поток будет ждать, пока не завершится t1
            t1.join(4000, 0);
            t1.interrupt();


            // Пока не завершится t2
            t2.join(1000);
            System.out.println(" t1 " + t1.isInterrupted());

        } catch (Exception ex) {

        }

    }


    void thisThread() {
        System.out.println("Попробую поспать");
        try{
            Thread.sleep(1000);
            int p = Thread.currentThread().getPriority();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Я поспал");
    }
}
