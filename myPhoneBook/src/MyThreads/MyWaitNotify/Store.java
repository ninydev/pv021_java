package MyThreads.MyWaitNotify;

public class Store {

    private int product=0;


    /**
     * Продажа товара
     */
    public synchronized void get() {
//        while (product<1) {
//            try {
//                wait();
//            }
//            catch (InterruptedException e) {
//            }
//        }

        if(product < 1 )
            try {wait(100);}
            catch (InterruptedException e) {}
        else
            notify();

        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        // notify();
    }


    /**
     * Принятие товара на склад
     */
    public synchronized void put() {
//        while (product>=3) {
//            try {
//                wait();
//            }
//            catch (InterruptedException e) {
//            }
//        }

        if(product >= 3 )
            try {wait(100);}
            catch (InterruptedException e) {}
        else
            notify();

        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        // notify();
    }


}
