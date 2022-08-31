package MyThreads.MySynchronized;

public class WorkSync implements Runnable
{
    /**
     * Метод запуска работы класса тест
     */
    @Override
    public void run() {

        CommonResource commonResource = new CommonResource();

        for (int i = 1; i < 5; i++){

            System.out.printf("Create: %d \n", i);

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread "+ i);
            t.start();

//            try{Thread.sleep(1000);}
//            catch(InterruptedException e){}


//            try {
//                t.join();
//            } catch (Exception ex) {
//
//            }

        }

        try{Thread.sleep(500);}
        catch(InterruptedException e){}
        // synchronized (commonResource) {
            System.out.printf("Change \n");
            commonResource.x = 10;
        // }

    }
}
