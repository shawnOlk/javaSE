package thread;


import java.util.concurrent.*;

/**
 * Created by sunlei on 27/02/2018.
 */
public class FeatureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask future=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return "1111";
            }
        });
        new Thread(future).start();
      System.out.print( future.get());

    }
}
