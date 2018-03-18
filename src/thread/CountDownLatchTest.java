package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by sunlei on 2018/3/7.
 */
public class CountDownLatchTest {
    public static void main(String[] args) {

        final CountDownLatch countDownLatch = new CountDownLatch(3);
        FutureTask<String> futureTask1=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                countDownLatch.countDown();
                return "11111";
            }
        });
        FutureTask<String> futureTask2=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                countDownLatch.countDown();
                return "22222";
            }
        });
        FutureTask<String> futureTask3=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                countDownLatch.countDown();
                return "33333";
            }
        });
        FutureTask<String> futureTask4=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                countDownLatch.countDown();
                return "44444";
            }
        });
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        new Thread(futureTask3).start();

        try {
            System.out.println("55555");
            countDownLatch.await();
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
            System.out.println(futureTask3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


}
