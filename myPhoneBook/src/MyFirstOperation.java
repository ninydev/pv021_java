
interface OperSum {
    int sum (int x, int y);
}

public class MyFirstOperation implements Runnable
{
    private void SimpleLambda(){
        OperSum cp;
        cp=(x,y) -> x + y;
        var res = cp.sum(2,2);
        System.out.println(res);
    }






    @Override
    public void run() {
        SimpleLambda();
    }
}
