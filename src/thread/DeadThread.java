package thread;

/**
 * Created by sunlei on 27/02/2018.
 */
public class DeadThread implements Runnable {

    private Object o1;
    private Object o2;

    public DeadThread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println(Thread.currentThread().getName() + "o1" + o1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"waiting"+o2);
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "o2" + o2);
            }

        }

    }
}
