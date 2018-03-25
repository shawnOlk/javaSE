package ali;

/**
 * Created by sunlei on 2018/3/21.
 */
public class AlarmB implements Runnable{

    private void sendEmailB() {
        System.out.println("报警B");
    }

    @Override
    public void run() {
        try {
            sendEmailB();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
