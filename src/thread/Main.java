package thread;

/**
 * Created by sunlei on 27/02/2018.
 */
public class Main {
    public static void main(String[] args) {
        Integer A = 1;
        Integer B = 2;
        DeadThread deadThread1 = new DeadThread(A, B);
        DeadThread deadThread2 = new DeadThread(B, A);
        Thread thread1=new Thread(deadThread1,"11111");
        Thread thread2=new Thread(deadThread2,"222222");
        thread1.start();
        thread2.start();
//        SynchtonizeTest test = new SynchtonizeTest();
//        new Thread(test).start();
//        new Thread(test).start();
    }
}
