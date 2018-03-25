package ali;

/**
 * Created by sunlei on 2018/3/21.
 */
public class AlarmA implements Runnable {

    private void sendEmailA() {
        System.out.println("报警A");
    }

    @Override
    public void run() {
        try {
            sendEmailA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
