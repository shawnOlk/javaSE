package thread;

/**
 * Created by sunlei on 2018/3/4.
 */
public class SynchtonizeTest implements   Runnable{


    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread()+"wewew");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                System.out.println(Thread.currentThread()+"1111");
            }
        }
    }
}
