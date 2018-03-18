package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by sunlei on 2018/3/7.
 */
public class CyclicBarrierTest extends Thread {
    CyclicBarrier barrier;
    String name;

    public CyclicBarrierTest(CyclicBarrier cyclicBarrier,String name) {
        barrier = cyclicBarrier;
        this.name=name;
    }

    public void run() {

        try {
            System.out.println(name+111111);
            barrier.await();
            System.out.println(name+222222);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        new CyclicBarrierTest(cyclicBarrier,"11111").start();
        new CyclicBarrierTest(cyclicBarrier,"22222").start();
        new CyclicBarrierTest(cyclicBarrier,"33333").start();
        new CyclicBarrierTest(cyclicBarrier,"44444").start();
        new CyclicBarrierTest(cyclicBarrier,"55555").start();
        new CyclicBarrierTest(cyclicBarrier,"66666").start();
    }
}
