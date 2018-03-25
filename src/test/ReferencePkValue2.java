package test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReferencePkValue2 implements Runnable {

    ReentrantLock lock = new ReentrantLock();

    Condition condition = lock.newCondition();

    public static void main(String[] args) {
      new Thread(new ReferencePkValue2()).start();

    }

    @Override
    public void run() {
        try {
            System.out.println("run start");
            condition.await();
            System.out.println("run end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}