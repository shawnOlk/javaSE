package thread;

/**
 * Created by sunlei on 27/02/2018.
 */
public class Main {
    public static void main(String[] args) {
        ThreadLocalTest test1=new ThreadLocalTest(1l);
        Thread thread1=new Thread(test1);
        Thread thread2=new Thread(test1);
        thread1.start();
        thread2.start();
    }
}
