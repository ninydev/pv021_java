package MyThreads.MyExchanger;

import java.util.concurrent.Exchanger;

class GetThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger<String> ex, String name){
        Thread.currentThread().setName(name);
        this.exchanger=ex;
        message = "GetThread send! " + Thread.currentThread().getName();
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("GetThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}