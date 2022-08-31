package MyThreads.MyExchanger;

import java.util.concurrent.Exchanger;

class PutThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger<String> ex, String name){
        Thread.currentThread().setName(name);
        this.exchanger=ex;
        message = "PutThread send! " + Thread.currentThread().getName();
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("PutThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}