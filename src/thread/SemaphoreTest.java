package thread;

import java.util.concurrent.Semaphore;

/**
 * Created by sunlei on 2018/4/9.
 */
public class SemaphoreTest implements Runnable{
    Semaphore semaphore=new Semaphore(2);
    static int a=1;


    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+a++);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        SemaphoreTest test1=new SemaphoreTest();
        Thread t=new Thread(test1,"111");
        Thread t1=new Thread(test1,"222");
        Thread t2=new Thread(test1,"333");
        t.start();
        t1.start();
        t2.start();


    }
}
